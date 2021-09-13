package exercise13;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Solution13 {

    /*
     * Pseudocode:
     * Prompt user "What is the principal amount?"
     * scan in double
     *
     * Prompt user "What is the rate (as a percentage)?"
     * scan in double
     *
     * Prompt user "What is the number of years?"
     * scan in integer
     *
     * Prompt user "What is the number of times the interest is compounded per year?"
     * scan in integer
     *
     * Find end amount = Principal(1 + (rate/periods per year))^(periods per year * years of interest)
     *
     * Print "'principal' invested at 'interestRate' for 'numberYears' years compounded 'periodsPerYear'
     *      times per year is 'endAmount'"
     *
     */

    public static void main(String[] args) {
        System.out.print("What is the principal amount? ");
        double principal = inputDouble();

        System.out.print("What is the interest rate as a percentage (ex. 15 not .15)? ");
        double interestRate = inputDouble();

        System.out.print("What is the number of years? ");
        int years = inputInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int timesPerYear = inputInt();

        double endAmount = getEndAmount(principal, interestRate, years, timesPerYear);
        BigDecimal dollar = BigDecimal.valueOf(endAmount);

        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times per year is %s.%n",
                principal, interestRate, years, timesPerYear, currencyFormat(dollar));
    }

        public static double inputDouble(){
            Scanner input = new Scanner(System.in);
            return input.nextDouble();
        }

        public static int inputInt(){
            Scanner input = new Scanner(System.in);
            return input.nextInt();
        }

        public static double getEndAmount(double principal, double interestRate, int years, int timesPerYear){
            double x = (1 + ((interestRate/100)/timesPerYear));
            double y = timesPerYear * (double) years;
            double z = Math.pow(x, y);
            double value = principal * z;
            return Math.ceil((value) * 100)/100;
        }

        public static String currencyFormat(BigDecimal n) {
            return NumberFormat.getCurrencyInstance().format(n);
        }
}
