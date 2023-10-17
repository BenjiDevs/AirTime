package edu.psu.ist.controller;

import edu.psu.ist.model.Item;
import edu.psu.ist.model.ItemCategory;
import edu.psu.ist.view.ItemView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ItemController implements ActionListener {
    private ItemView itemView;

    private List<Item> items = new ArrayList<>();
    int currentIndex;

    public ItemController() {
        this.itemView = new ItemView(this);
        addActionListeners();
        createInitialElements();
    }

    public void addActionListeners() {
        itemView.getAddButton().addActionListener(this);
        itemView.getNextButton().addActionListener(this);
        itemView.getPreviousButton().addActionListener(this);
        itemView.getQuitButton().addActionListener(this); // Add a listener for the Quit button
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

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton actionSource = (JButton) e.getSource();
        if (actionSource == itemView.getAddButton()) {
            Item newItem = itemView.createItem();
            // Check for null
            if (newItem != null) {
                items.add(newItem);
                currentIndex = items.indexOf(newItem);
            }
        }
        if (actionSource == itemView.getNextButton()) {
            itemView.clearFields();
            currentIndex = currentIndex + 1;
            displayItem(currentIndex);
        }
        if (actionSource == itemView.getPreviousButton()) {
            itemView.clearFields();
            currentIndex = currentIndex - 1;
            displayItem(currentIndex);
        }
        if (actionSource == itemView.getQuitButton()) {
            System.exit(0); // Quit the application
        }
    }



}
