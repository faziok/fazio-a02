package exercise14;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution14 {

    /*
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
        double amount = Double.parseDouble(input1.nextLine());

        System.out.print("What is the state? ");
        Scanner input2 = new Scanner(System.in);
        String state = input2.nextLine();

        String output = String.format("The total is $%.2f%n", amount);

        if (state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Wisconsin")) {
            output = String.format("The subtotal is $%.2f%nThe tax is $%.2f.%nThe total is $%.2f%n",
                    amount, (amount * .055), getNewAmount(amount));
        }

        System.out.print(output);
    }

    public static double getNewAmount(double amount){
        double taxedAmount = amount * .055;
        double newAmount = amount + (taxedAmount);
        return Math.ceil((newAmount) * 100)/100;
    }
}
