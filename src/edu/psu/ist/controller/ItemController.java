package edu.psu.ist.controller;

import edu.psu.ist.model.Item;
import edu.psu.ist.model.ItemCategory;
import edu.psu.ist.view.ItemView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ItemController implements ActionListener {

    // ItemTableModel theItemTableModel = new ItemTableModel (theItemList.getItemList());
    private ItemView itemView;

    private List<Item> items = new ArrayList<>();
    private ListController listController;
    int currentIndex;

    public ItemController() {
        this.itemView = new ItemView(this);
        addActionListeners();
        createInitialElements();
    }

    /*
    public ItemController(ListController listController) {
        this.listController = listController;
        this.items = listController.getItems();
        this.itemView = new ItemView(this);
        addActionListeners();
    }

     */

    public ItemController(ListController listController, int selectedRow) {
        this.listController = listController;
        this.items = listController.getItems();
        Item selectedItem = items.get(selectedRow);
        this.itemView = new ItemView(this, selectedItem);
        this.currentIndex = selectedRow;
        addActionListeners();
    }

    public void addActionListeners() {
        itemView.getAddButton().addActionListener(this);
        itemView.getNextButton().addActionListener(this);
        itemView.getPreviousButton().addActionListener(this);
        itemView.getQuitButton().addActionListener(this);
        itemView.getBackButton().addActionListener(this);
        itemView.getDeleteButton().addActionListener(this);
        itemView.getUpdateButton().addActionListener(this);
        itemView.getQuitButton().addActionListener(this);
    }


    public void createInitialElements() {
        Item item1 = new Item("item1", ItemCategory.FOOD, 20.99);
        Item item2 = new Item("item2", ItemCategory.TOILETRIES, 8.99);
        Item item3 = new Item("item3", ItemCategory.MISC, 12.99);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        currentIndex = 0;
        displayItem(0);
    }

    public void displayItem(int index) {
        Item previousItem = items.get(index);
        itemView.displayItem(previousItem);
    }

    public void hidePreviousButton(int currentIndex) {
        if (currentIndex == 0) {
            itemView.getPreviousButton().setVisible(false);
        }
        else {
            itemView.getPreviousButton().setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton actionSource = (JButton)e.getSource();
        if (actionSource == itemView.getAddButton()) {
            Item newItem = itemView.createItem();
            items.add(newItem);
            currentIndex = items.indexOf(newItem);
        }
        if (actionSource == itemView.getNextButton()) {
            itemView.clearFields();
            currentIndex = currentIndex + 1;
            hidePreviousButton(currentIndex);
            displayItem(currentIndex);
            itemView.setDisplayMessage("currentIndex = " + currentIndex);
        }
        if (actionSource == itemView.getPreviousButton()) {
            itemView.clearFields();
            currentIndex = currentIndex -1;
            hidePreviousButton(currentIndex); // sees if index is 0, hides the button if true
            displayItem(currentIndex);
            itemView.setDisplayMessage("displaying next element " + currentIndex);
        }
        if (actionSource == itemView.getClearButton()) {
            itemView.clearFields();
        }
        if (actionSource == itemView.getUpdateButton()) {
            //check for null, and other data validations
            Item updatedItem = itemView.createItem();
            items.set(currentIndex, updatedItem);
            itemView.setDisplayMessage("updated item. \ncurrent index = " + currentIndex);
        }
        if (actionSource == itemView.getDeleteButton()) {
            items.remove(currentIndex);
            itemView.clearFields();
            itemView.setDisplayMessage("DELETED item. \ncurrent index = " + currentIndex);
        }
        if (actionSource == itemView.getQuitButton()) {
            this.itemView.dispose();
        }
        if (actionSource == itemView.getBackButton()) {
            this.itemView.dispose();
            listController.showListView();
        }
    }



}
