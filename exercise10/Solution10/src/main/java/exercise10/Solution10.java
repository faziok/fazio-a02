package exercise10;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution10 {

    /*
     * Pseudocode:
     * Declare constant for 5%(.055) tax rate
     *
     * Prompt user for prices of THREE items and quantities of each.
     * scan prices and quantities into respective arrays using for loop.
     *
     * subTotal = item 1 + item 2 + item 3 in BigDecimal
     * Tax = subTotal * .055 in BigDecimal
     * Total = subTotal + Tax in BigDecimal
     *
     * print Subtotal, Tax, and Total on separate lines
     *
     */

    public static void main(String[] args) {
        final double taxRate = .055;

        Scanner input = new Scanner(System.in);

        String[] pricesStr = new String[3];
        String[] quantityStr = new String[3];
        double[] item = new double [3];

        for (int i = 0; i < pricesStr.length; i++){
            System.out.printf("Enter the price of item %d: ", (i+1));
            pricesStr[i] = input.nextLine();
            System.out.printf("Enter the quantity of item %d: ", (i+1));
            quantityStr[i] = input.nextLine();

            double price = Double.parseDouble(pricesStr[i]);
            double quantity = Double.parseDouble(quantityStr[i]);

            item[i] = price * quantity;
        }

        double subTotal = getSubTotal(item);
        double taxTotal = getTaxTotal(subTotal, taxRate);
        double totalAmount = getTotal(subTotal, taxTotal);

        System.out.printf("Subtotal: $%.2f%n", BigDecimal.valueOf(subTotal));
        System.out.printf("Tax: $%.2f%n", BigDecimal.valueOf(taxTotal));
        System.out.printf("Total: $%.2f%n", BigDecimal.valueOf(totalAmount));
    }

    public static double getSubTotal(double[] amounts){
        return amounts[0] + amounts[1] + amounts[2];
    }

    public static double getTaxTotal(double sub, double tax){
        return sub * tax;
    }

    public static double getTotal(double sub, double taxed){
        return sub + taxed;
    }
}
