package edu.psu.ist;

import edu.psu.ist.model.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        ArrayList<String> newRecommendedPackingList = new ArrayList<>();
        newRecommendedPackingList.add("toothbrush");
        newRecommendedPackingList.add("shirt");
        newRecommendedPackingList.add("hot dog");

        // initializes each class with two attributes
        User user1 = new User("john","smith","jsmith@psu.edu");
        Plane plane1 = new Plane("1", "2", 9000.0, 256);
        Trip trip1 = new Trip(date, "New York City");
        CurrentPackingList cpr1 = new CurrentPackingList(4, 3);
        RecommendedPackingList rpl1 = new RecommendedPackingList(3, newRecommendedPackingList);

        // toString() override
        System.out.println(user1);
        user1.setFName("jack"); // usage of setters
        System.out.println(user1);
        System.out.println();

        System.out.println(plane1);
        System.out.println(trip1);
        System.out.println(cpr1);
        System.out.println(rpl1);
    }
}
