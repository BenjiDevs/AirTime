package edu.psu.ist.model;

import java.util.Date;

public class Trip {

    private Date date;
    private String destination;

    public Trip(Date date, String destination) {
        this.date = date;
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDestination(String d) {
        this.destination = d;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "date=" + date +
                ", destination='" + destination + '\'' +
                '}';
    }
}
