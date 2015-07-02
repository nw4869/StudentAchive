package com.nightwind.studentarchive.model;

import java.util.List;

/**
 * Created by nightwind on 15/7/2.
 */
public class Student {

    private String sid;
    private Class clazz;
    private PersonInfo personInfo;

    private List<Event> events;

    public void register(String sid, Class clazz, PersonInfo personInfo) {
        this.sid = sid;
        this.clazz = clazz;
        this.personInfo = personInfo;
    }

    public String sid() {
        return sid;
    }

    public PersonInfo baseInfo() {
        return personInfo;
    }

    public void leave() {

    }

    public void discontinue() {

    }

    public void award(AwardEvent awardEvent) {

    }

    public void punish() {

    }

    public Class clazz() {
        return clazz;
    }
}
