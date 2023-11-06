package edu.psu.ist.model;

import java.io.Serializable;

public class Item extends Expense implements Printable, Serializable {
    private String itemName;
    private ItemCategory itemCategory;

    private double cost;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    public Item(String itemName, ItemCategory itemCategory, double cost) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.cost = cost;
    }

    // cost override to get cost of indiv. item and not total expense
    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemCategory=" + itemCategory +
                ", itemCost=" + cost +
                '}';
    }

    @Override
    public void printSetup() {

    }

    @Override
    public void print() {

    }
}
