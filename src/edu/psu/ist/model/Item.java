package edu.psu.ist.model;

public class Item extends Expense{
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
}
