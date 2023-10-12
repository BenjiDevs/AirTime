package edu.psu.ist.model;

public class StringUser extends User {
    private int numberOfStrings;
    private String userSize;

    // constructor
    public StringUser(String fName, String lName, String email, int numberOfStrings, String userSize) {
        super(fName, lName, email);
        this.numberOfStrings = numberOfStrings;
        this.userSize = userSize;
    }

    // getters & setters
    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getUserSize() {
        return userSize;
    }

    public void setUserSize(String userSize) {
        this.userSize = userSize;
    }

    // toString()
    @Override
    public String toString() {
        return "StringUser{" +
                "fName='" + super.getFName() + '\'' +
                ", lName='" + super.getLName() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                "numberOfStrings=" + numberOfStrings +
                ", userSize='" + userSize + '\'' +
                '}';
    }

}
