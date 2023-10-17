package edu.psu.ist.controller;

import edu.psu.ist.model.Item;
import edu.psu.ist.model.ItemCategory;
import edu.psu.ist.view.ListView;

import java.util.List;

public class ListController {

    private ListView listView;
    private int currentIndex;

    //public ListController listController;

    List<Item> items;

    public ListController() {
        this.listView = new ListView(this);
        //this.itemTableModel
    }

    public void createInitialElements() {
        Item item1 = new Item("list item1", ItemCategory.FOOD, 20.99);
        Item item2 = new Item("list item2", ItemCategory.TOILETRIES, 8.99);
        Item item3 = new Item("list item3", ItemCategory.MISC, 12.99);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        currentIndex = 0;
        //displayItem(0);
    }
}
