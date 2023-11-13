package edu.psu.ist.controller;


import edu.psu.ist.model.Item;
import edu.psu.ist.model.ItemCategory;
import edu.psu.ist.model.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ItemQueue {
    private LocalDate startDate; //The date this queue was started
    private LinkedList<Order> ordersToShip = new LinkedList<Order>();

    public ItemQueue(){
        this.setStartDate();
        this.buildShippingQueue();
        this.printShippingQueue();
    }

    public void setStartDate() {
        this.startDate = LocalDate.now();
    }

    public void buildShippingQueue() {

        Item item1 = new Item("1. toothbrush", ItemCategory.TOILETRIES, 8.99);
        Order order1 = new Order(item1, 1, LocalDate.now(), 1);

        Item item2 = new Item("2. skittles", ItemCategory.FOOD, 2.99);
        Order order2 = new Order(item2, 1, LocalDate.now(), 3);

        Item item3 = new Item("3. speaker", ItemCategory.MISC, 69.99);
        Order order3 = new Order(item3, 1, LocalDate.now(), 2);


        Order order4 = new Order(item3, 4, LocalDate.now(), 2);

        Order order5 = new Order(item3, 5, LocalDate.now(), 1);

        addOrder(order1);
        addOrder(order2);
        addOrder(order3);
        addOrder(order4);
        addOrder(order5);
    }

    public void printShippingQueue() {
        ListIterator orderIterator = ordersToShip.listIterator();
        while(orderIterator.hasNext()){
            System.out.println(orderIterator.next().toString());
        }
    }

    public void addOrder(Order newOrder){
        boolean orderAdded = false;
        boolean insertDecision = false;
        ListIterator<Order> orderIterator = ordersToShip.listIterator();
        while(orderIterator.hasNext()){
            insertDecision = orderIterator.next().decideToInsert(newOrder);
            if (insertDecision) {
                ordersToShip.add(orderIterator.previousIndex(), newOrder);
                orderAdded = true;
                break;
            }
        }
        if(orderAdded == false){
            ordersToShip.add(newOrder);
        }
    }

    public List<Order> searchItem(int shippingPriority) {
        List<Order> results = new ArrayList<>();
        ListIterator<Order> iterator = ordersToShip.listIterator();
        while (iterator.hasNext()) {
            Order currentElement = iterator.next();
            if (currentElement.getShippingPriority() == shippingPriority) {
                results.add(currentElement);
            }
        }
        System.out.println("search results: " + results);
        return results;
    }

    // action methods for project submission
    public void addItem(Order newOrder) { addOrder(newOrder);}

    public void removeItem(Order orderToRemove) { ordersToShip.remove(orderToRemove);}

    public void updateItem(Order updatedOrder) {
        removeItem(updatedOrder);
        addOrder(updatedOrder);
    }


    public Order getItem(String searchTerm) {
        ListIterator<Order> iterator = ordersToShip.listIterator();
        int index = 1;
        Order curr = null;
        while (iterator.hasNext()) {
            curr = iterator.next();
            Item currentItem = curr.getOrderItem();

            // try catch to handle null pointer
            try {
                if (currentItem != null && currentItem.getItemName().equalsIgnoreCase(searchTerm)) {
                    System.out.println(currentItem);
                    System.out.println("Ended at item: " + index);

                    return curr;
                }
            } catch (NullPointerException e) {
                System.out.println("Error: NullPointerException while accessing item name");
                return null;
            }
            index++;
        }
        System.out.println("Error: item " + searchTerm + " not found");
        return curr;
    }



    public String toString() {
        StringBuilder result = new StringBuilder("\nItemQueue{" +
                "startDate=" + startDate +
                "\n, ordersToShip=[\n");

        for (Order order : ordersToShip) {
            result.append(order.toString()).append(",\n");
        }

        result.append("]\n}");

        return result.toString();
    }
}
