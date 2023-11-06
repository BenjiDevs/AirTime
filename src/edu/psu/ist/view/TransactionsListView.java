package edu.psu.ist.view;

import edu.psu.ist.controller.TransactionListController;

import javax.swing.*;

public class TransactionsListView extends JFrame{
    private JPanel pnlRoot;
    private JTable tblTransaction;
    private JPanel pnlTable;
    private JPanel pnlButtons;
    private JButton btnDetail;
    private JButton btnDone;
    private JButton btnItemList;

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 600;
    private TransactionListController transactionListController;

    public TransactionsListView(TransactionListController transactionListController) {
        this.transactionListController = transactionListController;
        createListComponents();
    }

    public JButton getBtnDone() {
        return btnDone;
    }

    public JTable getTblTransaction() {
        return tblTransaction;
    }

    public JButton getBtnItemList() {
        return btnItemList;
    }

    public void createListComponents() {
        this.add(pnlRoot);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Transaction LIST");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        tblTransaction.setModel(transactionListController.getTransactionTableModel());
    }

}
