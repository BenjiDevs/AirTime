package edu.psu.ist.test;

import edu.psu.ist.model.Trip;
import edu.psu.ist.model.User;

import java.util.Date;

public class TestHarness {

    public static void main(String[] args) {

        // dates for trip testHarness
        Date date = new Date(2020, 1, 14);
        Date newDate = new Date(2000, 11, 21);

        // testHarness for trip
        Trip sampleTrip = new Trip(date, "New York");
        Trip testTrip = new Trip(sampleTrip.getDate(), sampleTrip.getDestination());

        System.out.println("trip before setters: " + testTrip);

        // testing setters
        testTrip.setDestination("Hartford");
        testTrip.setDate(newDate);

        System.out.println("trip after setters: " + testTrip);

        // testHarness for User
        User sampleUser = new User("John", "Smith", "jsmith@psu.edu");
        User testUser = new User(sampleUser.getFName(), sampleUser.getLName(), sampleUser.getEmail());

        System.out.println("\nuser info before setters: " + testUser);

        // testing setters
        testUser.setFName("Jack");
        testUser.setLName("Coles");
        testUser.setEmail("jcoles.psuedu");

        System.out.println("user info after setters: " + testUser);

        // showing use of getters
        System.out.println("\nThe trip to " + testTrip.getDestination() + " is on the Date: " + testTrip.getDate());

        System.out.println("This user is named " + testUser.getFName() + " "
                + testUser.getLName() + " with the email '" + testUser.getEmail() + "'");

    }
}
