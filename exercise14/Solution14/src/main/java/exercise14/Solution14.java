package exercise14;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution14 {
    Scanner input = new Scanner(System.in);

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
        Solution14 tax = new Solution14();

        double amount = Double.parseDouble(tax.scanInputNumeric("What is the order amount? "));
        String state = tax.scanInput("What is the state? ");

        System.out.print(tax.getOutput(state, amount));
    }

    public String scanInput(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    public String scanInputNumeric(String prompt){
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

    public double getNewAmount(double amount, double taxedAmount){
        double newAmount = amount + (taxedAmount);
        return Math.ceil((newAmount) * 100)/100;
    }

    public double taxedAmount (double amount){
        return amount * .055;
    }

    public String getOutput(String state, double amount){
        String output = String.format("The total is $%.2f%n", amount);
        if (state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Wisconsin")) {
            output = String.format("The subtotal is $%.2f%nThe tax is $%.2f.%nThe total is $%.2f%n",
                    amount, taxedAmount(amount), getNewAmount(amount, taxedAmount(amount)));
        }
        return output;
    }
}
