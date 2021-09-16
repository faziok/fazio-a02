package exercise11;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

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
        Solution11 exchange = new Solution11();

        System.out.print("How many euros are you exchanging? ");
        double euros = Double.parseDouble(exchange.input());

        System.out.print("What is the exchange rate? ");
        double exchangeRate = Double.parseDouble(exchange.input());

        System.out.printf("%.2f euros at an exchange rate of %.2f is%n$%.2f USD.%n",
                euros, exchangeRate, exchange.getConversion(euros, exchangeRate));

    }

    public String input(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public double getConversion(double currency, double rate){
        return Math.ceil((currency * rate) * 100)/100;
    }
}
