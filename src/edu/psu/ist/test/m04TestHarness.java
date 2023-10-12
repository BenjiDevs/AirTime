package edu.psu.ist.test;

import edu.psu.ist.model.Expense;
import edu.psu.ist.model.Flight;
import edu.psu.ist.model.Item;

import java.util.ArrayList;
import java.util.Date;

import static edu.psu.ist.model.ItemCategory.TOILETRIES;

public class m04TestHarness {

    public static void main(String[] args) {

        // ArrayList for test
        ArrayList<Expense> expenses = new ArrayList<>();

        // creating dates for test
        Date date0 = new Date(2020, 1, 14);
        Date date1 = new Date(2020, 1, 15);
        Date date2 = new Date(2023, 4, 19);

        Expense item = new Item("toothbrush", TOILETRIES, 9.95);
        Expense itemCopy = new Item("toothbrush", TOILETRIES, 9.95);
        Expense flight = new Flight("LAX", date0, "IAD", date1, 750.00);
        Expense flightCopy = new Flight("LAX", date0, "IAD", date1, 750.00);

        // setCost is overridden in both classes
        itemCopy.setCost(12.99);
        flightCopy.setCost(1743.50);

        expenses.add(item);
        expenses.add(itemCopy);
        expenses.add(flight);
        expenses.add(flightCopy);

        // getCost is overridden in both classes
        for (Expense expense : expenses) {
            System.out.println(expense.getCost());
        }
        double total = 0;
        System.out.println();

        Expense totalExpense = new Expense("Total Expense", total, date2);
        for (Expense expense : expenses) {
            total += expense.getCost();
            System.out.println(expense.getCost());
        }
        System.out.println("The final cost of this expense is: $" + total);
    }
}
