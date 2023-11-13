package edu.psu.ist.test;

import edu.psu.ist.controller.ItemQueue;
import edu.psu.ist.model.Order;

public class TestLinkedList {

    public TestLinkedList() {
        testShippingPriorities();
    }

    public void testShippingPriorities() {
        System.out.println("Queue:");
        ItemQueue testQueue = new ItemQueue();
        System.out.println();

        System.out.println("add test");
        Order orderToAdd = testQueue.getItem("2. skittles");
        testQueue.addItem(orderToAdd);
        System.out.println();

        // search test
        System.out.println("Search test");
        testQueue.searchItem(1);
        System.out.println();

        // getItem test
        System.out.println("getItem test");
        testQueue.getItem("2. skittles");
        System.out.println();

        // remove test
        System.out.println("Remove test");
        Order orderToRemove = testQueue.getItem("1. toothbrush");
        if (orderToRemove != null) {
            testQueue.removeItem(orderToRemove);
        }
        System.out.println();

        // updateTest
        System.out.println();
        Order orderToUpdate = testQueue.getItem("2. skittles");
        testQueue.updateItem(orderToUpdate);

    }
}
