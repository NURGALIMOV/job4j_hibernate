package ru.inurgalimov.models;

import java.util.Calendar;

/**
 * Модель данных.
 */
public class User {

    /**
     * Идентификатор пользователя.
     */
    private int id;

    /**
     * Имя пользователя.
     */
    private String name;

    /**
     * Дата.
     */
    private Calendar expired;

    /**
     * Возвращает идентификатор пользователя.
     *
     * @return идентификатор пользователя.
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает идентификатор пользователя.
     *
     * @param id устанавливаемый идентификатор пользователя.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Возвращает имя пользователя.
     *
     * @return имя пользователя.
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя пользователя.
     *
     * @param name устанавливаемое имя пользователя.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает дату.
     *
     * @return дата.
     */
    public Calendar getExpired() {
        return expired;
    }

    /**
     * Устанавливает дату.
     *
     * @param expired устанавливаемая дата.
     */
    public void setExpired(Calendar expired) {
        this.expired = expired;
    }
}
