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
