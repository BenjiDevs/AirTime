package edu.psu.ist.controller;

import edu.psu.ist.model.Transaction;
import edu.psu.ist.model.TransactionTableModel;
import edu.psu.ist.view.TransactionsListView;
import edu.psu.ist.view.TransactionsListView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TransactionListController implements ActionListener {
    private List<Transaction> transactionList = new ArrayList<>();

    private TransactionTableModel transactionTableModel;

    private TransactionsListView transactionListView;

    private TransactionPersistenceController transactionPersistenceController;

    public TransactionListController() {
        transactionPersistenceController = new TransactionPersistenceController();
        transactionList = transactionPersistenceController.getTransactions();
        transactionTableModel = new TransactionTableModel(transactionList);
        this.transactionListView = new TransactionsListView(this);
        addActionListeners();
    }

    public TransactionTableModel getTransactionTableModel() {
        return transactionTableModel;
    }

    private void addActionListeners() {
        transactionListView.getBtnDone().addActionListener(this);
        transactionListView.getBtnItemList().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == transactionListView.getBtnDone()) {
            System.exit(0);
        }
        if (obj == transactionListView.getBtnItemList()) {
            transactionListView.dispose();
            new ListController();
        }
    }

}
