package exercise10;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution10 {
    Scanner input = new Scanner(System.in);
    private static final double TAX_RATE = .055;

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
        Solution10 items = new Solution10();

        String[] pricesStr = new String[3];
        String[] quantityStr = new String[3];

        double[] item = items.getItemAndPrice(pricesStr, quantityStr);

        items.printOutput(item);
    }

    public double[] getItemAndPrice(String[] prices, String[] quantity){
        double[] item = new double[prices.length];

        for (int i = 0; i < prices.length; i++){
            prices[i] = isScanInputNumeric(String.format("Enter the price of item %d: ", (i+1)));
            quantity[i] = isScanInputNumeric(String.format("Enter the quantity of item %d: ", (i+1)));

            double price = Double.parseDouble(prices[i]);
            double itemQuantity = Double.parseDouble(quantity[i]);

            item[i] = price * itemQuantity;
        }
        return item;
    }

    public String isScanInputNumeric(String prompt){
        System.out.print(prompt);
        boolean numeric = input.hasNextDouble();
        String answer = input.nextLine();

        while (!numeric){
            System.out.print("Please answer with numeric values only: ");
            numeric = input.hasNextDouble();
            answer = input.nextLine();
        }
        return answer;
    }

    public double getSubTotal(double[] amounts){
        return amounts[0] + amounts[1] + amounts[2];
    }

    public double getTaxTotal(double sub, double tax){
        return sub * tax;
    }

    public double getTotal(double sub, double taxed){
        return sub + taxed;
    }

    public void printOutput(double[] item){
        double subTotal = getSubTotal(item);
        double taxTotal = getTaxTotal(subTotal, TAX_RATE);
        double totalAmount = getTotal(subTotal, taxTotal);

        System.out.printf("Subtotal: $%.2f%nTax: $%.2f%nTotal: $%.2f%n", BigDecimal.valueOf(subTotal),
                BigDecimal.valueOf(taxTotal), BigDecimal.valueOf(totalAmount));
    }
}
