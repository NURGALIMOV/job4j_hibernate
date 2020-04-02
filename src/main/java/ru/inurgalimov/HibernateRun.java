package ru.inurgalimov;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.inurgalimov.models.User;

import java.util.Calendar;

/**
 * Точка входа.
 */
public class HibernateRun {
    /**
     * delete a user
     * find all users
     * @param args
     */
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("/ru/inurgalimov/hibernate.cfg.xml").buildSessionFactory();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            User user = new User();
            user.setName("Create");
            user.setExpired(Calendar.getInstance());
            session.save(user);
            session.getTransaction().commit();
            session.createQuery("from User").list().stream().filter(u -> ((User) u).getId() == 1)
                    .findFirst().ifPresent(u -> System.out.println(((User) u).getName()));
            session.getTransaction().begin();
            user.setId(1);
            user.setName("Update");
            session.update(user);
            session.getTransaction().commit();
            session.createQuery("from User").list().stream().filter(u -> ((User) u).getId() == 1)
                    .findFirst().ifPresent(u -> System.out.println(((User) u).getName()));
            session.getTransaction().begin();
            session.delete(user);
            session.getTransaction().commit();
            System.out.println(session.createQuery("from User").list().isEmpty());
        } finally {
            factory.close();
        }
    }

}
