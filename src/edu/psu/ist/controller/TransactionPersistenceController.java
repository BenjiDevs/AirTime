package edu.psu.ist.controller;

import edu.psu.ist.model.Transaction;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionPersistenceController {
    private List<Transaction> transactions = new ArrayList<>();
    private String fileName = "TransactionFile3.txt";

    public TransactionPersistenceController() {
        readTransactionFile();
        if (transactions.isEmpty()) {
            writeTransactionFile();
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void writeTransactionFile() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(fileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(transactions);
            out.close();
            System.out.println("successful in writing data to file");
        } catch (IOException e) {
            System.out.println("caught exception while writing to file: " + e.getMessage());
        }
    }

    public void readTransactionFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(fileName);
            in = new ObjectInputStream(fis);
            transactions = (ArrayList) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("caught exception while reading from file: " + e.getMessage());
        }
        System.out.println("successful in reading from file");
    }

}
