package edu.psu.ist.controller;

import edu.psu.ist.model.ItemCategory;
import edu.psu.ist.model.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ItemPersistenceController {
    private List<Item> items = new ArrayList<>();
    private String fileName = "ItemFile.txt";

    public ItemPersistenceController() {
        readItemFile();
        if (items.isEmpty()) {
            createInitialElements();
            writeItemFile();
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void writeItemFile() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(fileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(items);
            out.close();
            System.out.println("successful in writing data to file");
        } catch (IOException e) {
            System.out.println("caught exception while writing to file: " + e.getMessage());
        }
    }

    public void readItemFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(fileName);
            in = new ObjectInputStream(fis);
            items = (ArrayList) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("caught exception while reading from file: " + e.getMessage());
        }
        System.out.println("successful in reading from file");
    }

    public void createInitialElements() {
        Item item1 = new Item("1. toothbrush", ItemCategory.TOILETRIES, 12.95);
        Item item2 = new Item("2. chips", ItemCategory.FOOD, 5.95);
        Item item3 = new Item("3. marbles", ItemCategory.MISC, 15.00);
        items.add(item1);
        items.add(item2);
        items.add(item3);
    }

}
