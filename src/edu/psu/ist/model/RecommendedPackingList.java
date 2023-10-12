package edu.psu.ist.model;

import java.util.ArrayList;
import java.util.List;

public class RecommendedPackingList {

    /**
     * Categories
     * Quantity of items
     * items
     */

    private int itemQuantity;
    private ArrayList<String> recPackingList;

    public RecommendedPackingList(int itemQuantity, ArrayList<String> recPackingList) {
        this.itemQuantity = itemQuantity;
        this.recPackingList = recPackingList;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public List<String> getRecPackingList() {
        return recPackingList;
    }

    public void setRecPackingList(ArrayList<String> recPackingList) {
        this.recPackingList = recPackingList;
    }

    @Override
    public String toString() {
        return "RecommendedPackingList{" +
                "itemQuantity=" + itemQuantity +
                ", recPackingList=" + recPackingList +
                '}';
    }
}
