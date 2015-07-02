package com.nightwind.studentarchive.model;

import java.util.Date;

/**
 * Created by nightwind on 15-7-2.
 */
public class Event {

    private String name;

    private Date date;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
