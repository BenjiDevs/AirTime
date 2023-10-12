package edu.psu.ist;

import edu.psu.ist.model.Plane;

// todo: maybe make maxSpeed and flightRange type double

public class StringPlane extends Plane {
    private int maxSpeed; // speed of plane *in mph*
    private int flightRange; // *in mph*

    // constructor
    public StringPlane(String make, String model, Double size, int capacity, int maxSpeed, int flightRange) {
        super(make, model, size, capacity);
        this.maxSpeed = maxSpeed;
        this.flightRange = flightRange;
    }

    // getters & setters
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    // toString() override
    @Override
    public String toString() {
        return "Plane{" +
                "make='" + super.getMake() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", size=" + super.getSize() +
                ", capacity=" + super.getCapacity() +
                "maxSpeed=" + maxSpeed +
                ", flightRange=" + flightRange +
                '}';
    }
}
