package edu.psu.ist.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Transaction implements Serializable {
    private String transactionItem;
    private LocalDate transactionDate;
    private double transactionAmount;

    public Transaction() {
    }

    public Transaction(String transactionItem, LocalDate transactionDate, double transactionAmount) {
        this.transactionItem = transactionItem;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionItem() {
        return transactionItem;
    }

    public void setTransactionItem(String transactionItem) {
        this.transactionItem = transactionItem;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionItem='" + transactionItem + '\'' +
                ", transactionDate=" + transactionDate +
                ", transactionAmount=" + transactionAmount +
                '}';
    }

    public void makeTransaction() { //allowing subclasses to implement

    }
    //getTransactionDetails
    public String getTransactionDetails() {
        return "Transaction DETAILS {" +
                "transactionItem='" + transactionItem + '\'' +
                ", transactionDate=" + transactionDate +
                ", transactionAmount=" + transactionAmount +
                '}';
    }

}
