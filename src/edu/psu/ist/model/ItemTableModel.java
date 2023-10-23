package edu.psu.ist.model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ItemTableModel extends AbstractTableModel {
    private String[] columnNames = {"Name", "Category", "Price"};
    private List<Item> itemList;

    public ItemTableModel(List<Item> newItemList) {
        this.itemList = newItemList;
    }

    @Override
    public int getRowCount() {
        return itemList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return itemList.get(row).getItemName();
            case 1:
                return itemList.get(row).getItemCategory();
            case 2:
                return itemList.get(row).getCost();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
}
