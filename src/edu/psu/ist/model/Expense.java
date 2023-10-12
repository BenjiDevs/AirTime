package edu.psu.ist.model;

import java.util.Date;

public class Expense {
    private String title;
    private double cost;
    private Date date;

    public Expense() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double amount) {
        this.cost = amount;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    public Expense(String title, double cost, Date date) {
        this.title = title;
        this.cost = cost;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                ", date=" + date +
                '}';
    }
}
