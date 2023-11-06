package edu.psu.ist.controller;

import edu.psu.ist.model.Item;
import edu.psu.ist.model.Transaction;
import edu.psu.ist.view.TransactionView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class TransactionController implements ActionListener {

    private TransactionView transactionView;

    public TransactionController(Item selectedItem) {
        transactionView = new TransactionView(this);
        addActionListeners();
        Transaction newTransaction = new Transaction(selectedItem.getItemName(), LocalDate.now(), selectedItem.getCost());
        transactionView.displayTransaction(newTransaction);
    }

    public void addActionListeners() {
        transactionView.getBtnAdd().addActionListener(this);
        transactionView.getBtnClear().addActionListener(this);
        transactionView.getBtnBack().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == transactionView.getBtnAdd()) {
            Transaction newTransaction = transactionView.createTransaction();
            TransactionPersistenceController transactionPersistenceController = new TransactionPersistenceController();
            transactionPersistenceController.getTransactions().add(newTransaction);
            transactionPersistenceController.writeTransactionFile();
            showTransactionListView();
        }
        if (obj == transactionView.getBtnClear()) {
            transactionView.clearFields();
        }
        if (obj == transactionView.getBtnBack()) {
            showTransactionListView();
        }
    }

    private void showTransactionListView() {
        transactionView.dispose();
        new TransactionListController();
    }

}
