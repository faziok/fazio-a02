package exercise11;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Solution11 {

    /*
     * Write a program that converts currency. Specifically, convert euros to U.S. dollars.
     * Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro.
     * Print out the new amount in U.S. dollars.
     * The formula for currency conversion is derived from
     * "c_to / c_from = rate"
     * where c_to is the amount in U.S. dollars. c_from is the amount in euros.
     * rate is the per-unit current exchange rate from c_from to c_to
     *
     * Example Output:
     * How many euros are you exchanging? 81
     * What is the exchange rate? 1.3751
     * 81 euros at an exchange rate of 1.3751 is
     * 111.38 U.S. dollars
     *
     * Constraints
     * -Ensure that fractions of a cent are rounded up to the next penny.
     * -Use a single output statement.
     *------------
     * Pseudocode:
     * Prompt user "How many euros are you exchanging?"
     * scan input
     *
     * Prompt user "What is the exchange rate?"
     * scan input
     *
     * get conversion (always rounding up for a fraction of a cent)
     * 
     * print number of euros at exchange rate in US Dollars in single output.
     */

    public static void main(String[] args) {
        System.out.print("How many euros are you exchanging? ");
        double euros = input();

        System.out.print("What is the exchange rate? ");
        double exchangeRate = input();

        System.out.printf("%.2f euros at an exchange rate of %.4f is%n$%.2f U.S. dollars%n",
                euros, exchangeRate, getConversion(euros, exchangeRate));

    }

    public static double input(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public static double getConversion(double currency, double rate){
        double newValue =Math.ceil((currency * rate) * 100)/100;
        return newValue;
    }
}
