package exercise11;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution11 {
    Scanner input = new Scanner(System.in);

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

        double euros = Double.parseDouble(exchange.isScanInputNumeric("How many euros are you exchanging? "));
        double exchangeRate = Double.parseDouble(exchange.isScanInputNumeric("What is the exchange rate? "));

        System.out.printf("%.2f euros at an exchange rate of %.2f is%n$%.2f USD.%n",
                euros, exchangeRate, exchange.getConversion(euros, exchangeRate));

    }

    public String isScanInputNumeric(String prompt){
        System.out.print(prompt);
        boolean numeric = input.hasNextDouble();
        String answer = input.nextLine();

        while (!numeric){
            System.out.print("Please answer with values only: ");
            numeric = input.hasNextDouble();
            answer = input.nextLine();
        }
        return answer;
    }

    public double getConversion(double currency, double rate){
        return Math.ceil((currency * rate) * 100)/100;
    }
}
