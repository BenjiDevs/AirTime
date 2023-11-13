package edu.psu.ist.model;

import java.time.LocalDate;

public class Order {
    private Item orderItem;
    private long orderNumber;
    private LocalDate orderDate;
    private int shippingPriority;

    public Order(Item orderItem, long orderNumber, LocalDate orderDate, int shippingPriority) {
        this.orderItem = orderItem;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.shippingPriority = shippingPriority;
    }

    public Item getOrderItem() {
        return orderItem;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getShippingPriority() {
        return shippingPriority;
    }

    public boolean decideToInsert(Order order){
        boolean decision = false;
        if (this.shippingPriority > order.shippingPriority) {
            decision = true;
        }
        if (this.shippingPriority == order.shippingPriority) {
            if (this.orderNumber > order.orderNumber) {
                decision = true;
            }
        }
        return decision;
    }

    @Override
    public String toString() {
        return "Order{" +
//                "orderItem=" + orderItem +
                ", orderNumber=" + orderNumber +
//                ", orderDate=" + orderDate +
                ", shippingPriority=" + shippingPriority +
                '}';
    }


}
