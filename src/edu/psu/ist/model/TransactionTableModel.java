package edu.psu.ist.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TransactionTableModel extends AbstractTableModel {

    private String[] columnNames = {"Item", "Amount", "Transaction Date"};
    private List<Transaction> transactionList = new ArrayList<>();

    public TransactionTableModel(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    // override getters
    @Override
    public int getRowCount() {
        return transactionList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return (Object) transactionList.get(rowIndex).getTransactionItem();
            case 1:
                return (Object) transactionList.get(rowIndex).getTransactionAmount();
            case 2:
                return (Object) transactionList.get(rowIndex).getTransactionDate();
            default: return null;

        }
    }

    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }


}
