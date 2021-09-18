package exercise12;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Solution12 {
    Scanner input = new Scanner(System.in);

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
        Solution12 interest = new Solution12();

        double principalBalance = Double.parseDouble(interest.scanInput("Enter the Principal: "));
        double interestRate = Double.parseDouble(interest.scanInput("Enter the interest rate as a percentage " +
                "(ex. 15 not .15)? "));
        int numberYears = Integer.parseInt(interest.scanInput("Enter the number of years: "));

        double totalAccrued = interest.getNewBalance(principalBalance, interestRate, numberYears);
        BigDecimal dollar = BigDecimal.valueOf(totalAccrued);

        System.out.printf("After %d years at %.1f%% interest, the investment will be worth %s.%n",
                numberYears, interestRate, interest.currencyFormat(dollar));

    }

    public String scanInput(String prompt){
        System.out.print(prompt);
        return isNumeric();
    }

    public String isNumeric(){
        boolean numeric = input.hasNextDouble();
        String answer = input.nextLine();

        while (!numeric){
            System.out.print("Please answer with numeric values only: ");
            numeric = input.hasNextDouble();
            answer = input.nextLine();
        }
        return answer;
    }

    public double getNewBalance(double principal, double rate, int time){
        double value = principal * (1 + ((rate/100) * time));
        return Math.ceil((value) * 100)/100;
    }

    public String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }
}
