package edu.psu.ist.view;

import edu.psu.ist.controller.TransactionController;
import edu.psu.ist.model.Transaction;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransactionView extends JFrame {
    private JTextField txtItem;
    private JPanel pnlTransaction;
    private JTextField txtAmount;
    private JTextField txtDate;
    private JButton btnAdd;
    private JButton btnPrevious;
    private JButton btnNext;
    private JButton btnUpdate;
    private JButton btnQuit;
    private JButton btnDelete;
    private JButton btnBack;
    private JLabel lblItem;
    private JLabel lblAmount;
    private JLabel lblDate;
    private JButton btnClear;
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 600;
    TransactionController transactionController;

    public TransactionView(TransactionController transactionController) {
        this.transactionController = transactionController;
        createComponents();
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnClear() {
        return btnClear;
    }

    public void createComponents() {
        this.add(pnlTransaction);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Transaction GUI Screen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public Transaction createTransaction() {
        String item = txtItem.getText().trim();
        String strAmount = txtAmount.getText();
        double amount = 0;
        try {
            amount = Double.parseDouble(strAmount);
        } catch (NumberFormatException e) {
            return null;
        }
        String strDate = txtDate.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(strDate, formatter);
        Transaction transaction = new Transaction(item, date, amount);
        return transaction;
    }

    public void displayTransaction(Transaction transaction) {
        this.txtItem.setText(transaction.getTransactionItem());
        this.txtAmount.setText(String.valueOf(transaction.getTransactionAmount()));
        this.txtDate.setText(String.valueOf(transaction.getTransactionDate()));
    }

    public void clearFields() {
        this.txtItem.setText("");
        this.txtAmount.setText("");
    }

}
