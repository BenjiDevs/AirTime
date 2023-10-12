package edu.psu.ist.model;

import java.util.Date;

public class Flight extends Expense {
    /*
    Mode of transport (e.g., flight, train)
Departure location
Arrival location
Departure time
Arrival time
Additional Methods:
Calculate cost (inherits from TravelItem)
Display details (overrides superclass method to include transportation-specific details)
     */

    private String departureLocation;
    private Date departureTime;
    private String arrivalLocation;
    private Date arrivalTime;

    private double cost;




    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Flight(String title, double cost, Date date) {
        super(title, cost, date);
    }

    public Flight(String departureLocation, Date departureTime, String arrivalLocation, Date arrivalTime, double cost) {
        this.cost = cost;
        this.departureLocation = departureLocation;
        this.departureTime = departureTime;
        this.arrivalLocation = arrivalLocation;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureLocation='" + departureLocation + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalLocation='" + arrivalLocation + '\'' +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
