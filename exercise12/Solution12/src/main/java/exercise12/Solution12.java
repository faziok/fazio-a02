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
     * Create a program that computes simple interest. Prompt for the principal amount,
     * the rate as a percentage, and the time, and display the amount accrued (principal + interest).
     * The formula for simple interest is A = P(1 + rt), where P is the principal amount,
     * r is the annual rate of interest, t is the number of years the amount is invested,
     * and A is the amount at the end of the investment.
     *
     * Example Output:
     * Enter the principal: 1500
     * Enter the rate of interest: 4.3
     * Enter the number of years: 4
     * After 4 years at 4.3%, the investment will be worth $1758.
     *
     * Constraints
     * -Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
     * -Ensure that fractions of a cent are rounded up to the next penny.
     * -Ensure that the output is formatted as money.
     *
     ----------------
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
     *
     *
     */

    public static void main(String[] args) {
        System.out.print("Enter the Principal: ");
        double principalBalance = input();
        System.out.print("Enter the rate of interest: ");
        double interestRate = input();
        System.out.print("Enter the number of years: ");
        int numberYears = (int) input();

        double totalAccrued = getNewBalance(principalBalance, interestRate, numberYears);
        BigDecimal dollar = BigDecimal.valueOf(totalAccrued);

        System.out.printf("After %d years at %.1f%%, the investment will be worth %s.%n",
                numberYears, interestRate, currencyFormat(dollar));

    }

    public static double input(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public static double getNewBalance(double principal, double rate, int time){
        double value = principal * (1 + ((rate/100) * time));
        return Math.ceil((value) * 100)/100;
    }

    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }
}
