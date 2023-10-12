package edu.psu.ist.model;

public class Plane implements Printable {

    private String make;
    private String model;
    private Double size;
    private int capacity;

    public Plane() {
        System.out.println("in plane empty constructor...");
    }

    public Plane(String make, String model, Double size, int capacity) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.capacity = capacity;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Double getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public void printSetup() {
        System.out.println("This is the " + this.getClass().getSimpleName() + " class");
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
