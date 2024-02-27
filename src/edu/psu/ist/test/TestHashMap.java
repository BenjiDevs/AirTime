package edu.psu.ist.test;

import edu.psu.ist.controller.HashMapController;
import edu.psu.ist.model.ItemCategory;
import edu.psu.ist.model.Item;

import java.util.List;

public class TestHashMap {
    public TestHashMap() {
        testHashMap();
    }
    public void testHashMap() {
        HashMapController hashMapController = new HashMapController();

        Item item1 = new Item("skittles", ItemCategory.FOOD, 20.00);
        hashMapController.addItem(item1);
        System.out.println("\nadded new Item to inventory----");
        hashMapController.printCollection();

        System.out.println("\napplying discount----------");
        hashMapController.applyDiscount(10);
        hashMapController.printCollection();

        Item item2 = new Item("toothbrush", ItemCategory.TOILETRIES, 2000);
        hashMapController.addItem(item2);
        String searchTerm = "toothbrush";
        System.out.println("\nsearching for " + searchTerm + " ------");
        List<Item> searchResults = hashMapController.searchCollection(searchTerm);
        System.out.println(searchResults);

        System.out.println("\ndeleting item ----");
        //make sure to check null, empty, outOfBounds exception before accessing the searchResults collection element
        hashMapController.removeItem(searchResults.get(1));
        hashMapController.printCollection();

        // test getItem()
        System.out.println("\nTesting getItem ------");
        int itemIdToGet = 1; // Change the item ID based on your requirements
        Item getItemResult = hashMapController.getItem(itemIdToGet);
        System.out.println("Item with ID " + itemIdToGet + ": " + getItemResult);

        // test addItem()
        System.out.println("\ntesting addItem -------");
        Item newItem = new Item("newItem", ItemCategory.MISC, 10.00);
        hashMapController.addItem(newItem);
        hashMapController.printCollection();

        // test updateItem()
        System.out.println("\ntesting updateItem----------");
        int itemIdToUpdate = 2; // Change the item ID based on your requirements
        Item updatedItem = new Item("updatedItem", ItemCategory.APPAREL, 30.00);
        hashMapController.updateItem(itemIdToUpdate, updatedItem);
        hashMapController.printCollection();

        // test removeItem()
        System.out.println("\ntesting removeItem -------");
        int itemIdToRemove = 3; // Change the item ID based on your requirements
        hashMapController.removeItem(itemIdToRemove);
        hashMapController.printCollection();

    }





}
