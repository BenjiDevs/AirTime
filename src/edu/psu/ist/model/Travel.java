package edu.psu.ist.model;

import java.util.Date;

public class Travel {

    private String name;
    private String location;
    private Date date;
    private double cost;


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", cost=" + cost +
                '}';
    }
}
