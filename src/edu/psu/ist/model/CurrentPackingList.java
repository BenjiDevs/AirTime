package edu.psu.ist.model;

import java.util.List;

public class CurrentPackingList {

    /**
     * Items
     * Quantity of items
     * Checked off items
     */

    // todo: parallel lists with item nadme and if its checked off or not
    // todo: make method to check off items

    // List<String> packingList = new ArrayList<>();
    // List<String> packingListChecked = new ArrayList<>();

    private int itemsQuantity;
    private int checkedItems;
    private List<Item> currPackingList;

    public CurrentPackingList(int itemsQuantity, int checkedItems) {
        this.itemsQuantity = itemsQuantity;
        this.checkedItems = checkedItems;
    }

    public List<Item> getCurrPackingList() {
        return currPackingList;
    }

    public void setCurrPackingList(List<Item> currPackingList) {
        this.currPackingList = currPackingList;
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public int getCheckedItems() {
        return checkedItems;
    }

    public void setItemsQuantity(int itemsQuantity) {
        this.itemsQuantity = itemsQuantity;
    }

    public void setCheckedItems(int checkedItems) {
        this.checkedItems = checkedItems;
    }

    @Override
    public String toString() {
        return "CurrentPackingList{" +
                "itemsQuantity=" + itemsQuantity +
                ", checkedItems=" + checkedItems +
                ", currPackingList=" + currPackingList +
                '}';
    }
}
