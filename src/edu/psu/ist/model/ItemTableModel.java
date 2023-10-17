package edu.psu.ist.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ItemTableModel extends AbstractTableModel {
    private String[] columnNames = {"Name", "Category", "Price"};
    private List<Item> itemList;

    public ItemTableModel(ArrayList<Item> newItemList){

        itemList = newItemList = new ArrayList<>();
    }

    public int getRowCount() {
        return itemList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    public Object getValueAt(int row, int col) {
        switch(col){
            case 0: return (Object) itemList.get(row).getItemName();
            case 1: return (Object) itemList.get(row).getItemCategory();
            case 2: return (Object) itemList.get(row).getCost();
            default: return null;
        }
    }

    //@Override
    public String getColumnName(int col){
        return columnNames[col];
    }
}
