package edu.psu.ist.controller;

import edu.psu.ist.model.Item;
import edu.psu.ist.model.ItemCategory;
import edu.psu.ist.model.ItemTableModel;
import edu.psu.ist.view.ListView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ListController implements ActionListener {

    private ListView listView;
    private int currentIndex;
    List<Item> items = new ArrayList<>();
    ItemController itemController;
    ItemTableModel itemTableModel;

    public ListController() {
        createInitialElements();
        this.itemTableModel = new ItemTableModel(items);
        this.listView = new ListView(this);
        addActionListeners();
        //this.itemTableModel
    }

    public ItemTableModel getItemTableModel() {
        return itemTableModel;
    }

    public List<Item> getItems() {
        return items;
    }

    public void createInitialElements() {
        Item item1 = new Item("list item1", ItemCategory.FOOD, 20.99);
        Item item2 = new Item("list item2", ItemCategory.TOILETRIES, 8.99);
        Item item3 = new Item("list item3", ItemCategory.MISC, 12.99);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        System.out.println(items);
    }

    public void addActionListeners() {
        listView.getBtnNew().addActionListener(this);
        listView.getBtnDetail().addActionListener(this);
        listView.getBtnDone().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == listView.getBtnNew()) {
            listView.dispose();
            int lastRow = listView.getTblItem().getRowCount() - 1;
            this.itemController = new ItemController(this, lastRow);

        }
        //instantiate InstrumentController without the selectedRow
        //it may require new constructor in InstrumentController that accepts ListController as a parameter
        //make sure to clear the fields on the details view


        if (e.getSource() == listView.getBtnDetail()) {
            listView.dispose();
            //find the selected row
            int selectedRow = listView.getTblItem().getSelectedRow();
            System.out.println("selectedRow = " + selectedRow);
            //if no row is selected on the list, set it to show first element on the details view
            //show a detail view with the data for the selected element
            //pass the flow from list controller to details controller
            //do not instantiate the details view from this list controller
            this.itemController = new ItemController(this, selectedRow);
        }
        if (e.getSource() == listView.getBtnDone()) {
            listView.dispose();
        }


    }



    public void showListView() {this.listView.setVisible(true);}


}
