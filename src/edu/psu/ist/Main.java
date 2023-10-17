package edu.psu.ist;

import edu.psu.ist.controller.ItemController;
import edu.psu.ist.view.ItemView;

public class Main {
    public static void main(String[] args) {
//        TestHarness_manual testHarness = new TestHarness_manual();
//        TestInheritance testInheritance = new TestInheritance();
//        TestInterface testInterface = new TestInterface();
        //MVC
        //do not create view directly
        //instantiate controller

        ItemController itemController = new ItemController();
        //ItemView itemView = new ItemView(itemController);
    }
}