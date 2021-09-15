package exercise12;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Solution12 {


    /*
     * Pseudocode:
     * prompt user "Enter the principal:"
     * scan input
     *
     * prompt user "Enter the rate of interest:"
     * scan input (divide by 100 to get decimal)
     *
     * prompt user "Enter the number of years:"
     * scan input
     *
     * get accrued  = Principal (1 + (rate * time))
     * round to nearest cent
     * format to bigdecimal and convert to US dollar format.
     *
     * output number years at interest rate will be totalAccrued
     */

    public static void main(String[] args) {
        System.out.print("Enter the Principal: ");
        double principalBalance = Double.parseDouble(input());
        System.out.print("Enter the interest rate as a percentage (ex. 15 not .15)? ");
        double interestRate = Double.parseDouble(input());
        System.out.print("Enter the number of years: ");
        int numberYears = Integer.parseInt(input());

        double totalAccrued = getNewBalance(principalBalance, interestRate, numberYears);
        BigDecimal dollar = BigDecimal.valueOf(totalAccrued);

        System.out.printf("After %d years at %.1f%%, the investment will be worth %s.%n",
                numberYears, interestRate, currencyFormat(dollar));

    }

    public static String input(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static double getNewBalance(double principal, double rate, int time){
        double value = principal * (1 + ((rate/100) * time));
        return Math.ceil((value) * 100)/100;
    }

    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }
}
