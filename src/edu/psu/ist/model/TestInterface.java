package edu.psu.ist.model;

import edu.psu.ist.StringPlane;

import java.util.ArrayList;

public class TestInterface {

    public static void main(String[] args) {
        new TestInterface();
    }

    public TestInterface() {
        testInterface();
    }

    public void testInterface() {
        System.out.println("in the test method...");
        Printable user = new User();
        Printable plane = new Plane();

        ArrayList<Printable> printables = new ArrayList<Printable>();
        printables.add(user);
        printables.add(plane);

        // cannot morph Return to Printable
        // Return returnTransaction = new Return();
        // printables.add(returnTransaction);

        // todo: change @params for StringUser and StringPlane constructors

        StringUser stringUser = new StringUser("john", "smith", "jsmith@psu.edu", 4, "SIZE");
        StringPlane stringPlane= new StringPlane("boeing", "123", 400.50, 169, 521, 4045);
        printables.add(stringUser);
        printables.add(stringPlane);


        for (Printable printable : printables) {
            System.out.println("-----------------------------");
            printable.printSetup();
            printable.print();
        }

    }
}
