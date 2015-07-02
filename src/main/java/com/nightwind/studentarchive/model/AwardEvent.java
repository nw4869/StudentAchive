package com.nightwind.studentarchive.model;

import java.util.Date;

/**
 * Created by nightwind on 15-7-2.
 */
public class AwardEvent extends Event {

    private String price;

    private String level;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
