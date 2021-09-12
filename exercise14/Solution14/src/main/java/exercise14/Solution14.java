package exercise14;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution14 {

    /*
     * Write a simple program to compute the tax on an order amount.
     * The program should prompt for the order amount and the state.
     * If the state is "WI" then the order must be charged 5.5% tax.
     * The program should display the subtotal, tax, and total for Wisconsin residents
     * but display just the total for non-residents.
     *
     * Example Output
     * What is the order amount? 10
     * What is the state? WI
     * The subtotal is $10.00.
     * The tax is $0.55.
     * The total is $10.55.
     *
     * Or
     *
     * What is the order amount? 10
     * What is the state? MN
     * The total is $10.00
     *
     * Constraints:
     * Implement this program using only a simple if statement—don’t use an else clause.
     * Ensure that all money is rounded up to the nearest cent.
     * Use a single output statement at the end of the program to display the program results.
     *
     * Pseudocode:
     * Prompt user "What is order amount?"
     * scan in double
     *
     * Prompt user "What is the state? 2 letter abbreviation?"
     * scan in string
     *
     * get newAmount rounded to nearest cent.
     *
     * If state is Wisconsin charge 5.5% tax.
     *    Print Subtotal, tax, and new total
     *     If state is NOT Wisconsin
     *      Print subtotal as total
     *
     */

    public static void main(String[] args) {
        System.out.print("What is the order amount? ");
        Scanner input1 = new Scanner(System.in);
        double amount = input1.nextDouble();

        System.out.print("What is the state? ");
        Scanner input2 = new Scanner(System.in);
        String state = input2.nextLine();

        String output = String.format("The total is $%.2f%n", amount);

        if (state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Wisconsin")) {
            output = String.format("The subtotal is $%.2f%nThe tax is 5.5%%%nThe total is $%.2f%n",
                    amount, getNewAmount(amount));
        }

        System.out.print(output);
    }

    public static double getNewAmount(double amount){
        double taxedAmount = amount * .055;
        double newAmount = amount + (taxedAmount);
        return Math.ceil((newAmount) * 100)/100;
    }
}
