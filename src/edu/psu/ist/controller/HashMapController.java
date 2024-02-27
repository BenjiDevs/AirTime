package edu.psu.ist.controller;

import edu.psu.ist.model.ItemCategory;
import edu.psu.ist.model.Item;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class HashMapController {

    Map<Integer, Item> itemInventory = new HashMap<>();

    AtomicInteger sequenceNumber = new AtomicInteger();

    public HashMapController() {
        createInitialCollection();
        printCollection();
    }

    private void createInitialCollection() {
        Item item1 = new Item("1. skittles ", ItemCategory.FOOD, 3.99);
        Item item2 = new Item("2.  toothbrush ", ItemCategory.TOILETRIES, 8.99);
        Item item3 = new Item("3.  sneakers ", ItemCategory.APPAREL, 95.00);
        itemInventory.put(sequenceNumber.incrementAndGet(), item1);
        itemInventory.put(sequenceNumber.incrementAndGet(), item2);
        itemInventory.put(sequenceNumber.incrementAndGet(), item3);
    }

    public void printCollection() {
        //for-loop, iterator, streams(>java 8)
//        System.out.println("accessing collection through for loop");
        for (Map.Entry entry:itemInventory.entrySet()) {
            System.out.println("entry: " + entry);
        }
//        System.out.println("accessing collection through iterator");
//        Iterator iterator = itemInventory.entrySet().iterator();
//        while(iterator.hasNext()) {
//            Map.Entry entry = (Map.Entry)iterator.next();
//            System.out.println("entry: " + entry);
//        }
//        System.out.println("accessing collection through streams");
//        itemInventory.entrySet().stream().forEach(entry->System.out.println("entry: " + entry));
    }



    public void applyDiscount(int discountPercentage) {
        for (Map.Entry entry:itemInventory.entrySet()) {
            Integer key = (Integer) entry.getKey();
            Item item = (Item) entry.getValue();
            double discountedPrice = item.getCost()*(100-discountPercentage)/100;
            item.setCost(discountedPrice);
//            entry.setValue(item);
        }
    }

    public List<Item> searchCollection(String searchTerm) {
        List<Item> searchResults = new ArrayList<>();
        for (Map.Entry entry:itemInventory.entrySet()) {
            Item item = (Item)entry.getValue();
            if (item.getItemName().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchResults.add(item);
            }
        }
        return searchResults;
    }

    public void removeItem(Item item) {
        Iterator iterator = itemInventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Item existingItem = (Item)entry.getValue();
            Integer key = (Integer) entry.getKey();
            if (existingItem.equals(item)) {
                iterator.remove();
//                itemInventory.remove(key); //--- ConcurrentModificationException
            }
        }
    }

    public void addItem(Item item) {
        itemInventory.put(sequenceNumber.incrementAndGet(), item);
    }

    public Item getItem(int itemId) {
        return itemInventory.get(itemId);
    }

    public void updateItem(int itemId, Item newItem) {
        if (itemInventory.containsKey(itemId)) {
            itemInventory.put(itemId, newItem);
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }

    public void removeItem(int itemId) {
        Iterator<Map.Entry<Integer, Item>> iterator = itemInventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Item> entry = iterator.next();
            if (entry.getKey() == itemId) {
                iterator.remove();
                System.out.println("Item with ID " + itemId + " removed.");
                return;
            }
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }


}
