package edu.psu.ist.model;

public class User implements Printable{
    private String fName;
    private String lName;
    private String email;

    // constructor

    public User() {
        System.out.println("in user empty constructor...");
    }
    public User(String fName, String lName, String email) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }


    // getters & setters
    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
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



// todo: override toString - convenience method to present data


