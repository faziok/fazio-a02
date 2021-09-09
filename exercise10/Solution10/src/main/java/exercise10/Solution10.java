package exercise10;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution10 {

    /*
     * Create a simple self-checkout system. Prompt for the prices and quantities of three items.
     * Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%.
     * Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.
     *
     * Example Output:
     * Enter the price of item 1: 25
     * Enter the quantity of item 1: 2
     * Enter the price of item 2: 10
     * Enter the quantity of item 2: 1
     * Enter the price of item 3: 4
     * Enter the quantity of item 3: 1
     * Subtotal: $64.00
     * Tax: $3.52
     * Total: $67.52
     *
     * Constraints:
     * -Keep the input, processing, and output parts of your program separate.
     *      Collect the input, then do the math operations and string building, and then print out the output.
     * -Be sure you explicitly convert input to numerical data before doing any calculations.
     ---------------------
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

        double[] prices = new double[3];
        double[] quantity = new double[3];
        double[] item = new double [3];

        for (int i = 0; i < prices.length; i++){
            System.out.printf("Enter the price of item %d: ", (i+1));
            prices[i] = input.nextDouble();
            System.out.printf("Enter the quantity of item %d: ", (i+1));
            quantity[i] = input.nextDouble();

            item[i] = prices[i] * quantity[i];
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
