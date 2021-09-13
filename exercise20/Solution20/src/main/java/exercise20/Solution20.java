package exercise20;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution20 {

    /*
     * Pseudocode:
     * declare constant for Wisconsin 5% state tax
     * declare constant for Illinois 8% state tax
     *
     * Prompt user "What is order amount?"
     * scan in subTotal/check if numeric
     *
     * Prompt user "What is the state? 2 letter abbreviation?"
     * scan in state
     *
     * declare taxPercentage = 0%
     *
     * If state = wisconsin
     *      prompt user "Which county do you live in? Eau Claire or Dunn??"
     *      scan in string
     *
     * get county tax
     *      if county = eau claire
     *          wisconsinStateTax += .005
     *      else if country = Dunn
     *          wisconsinStateTax += .004
     *      return taxPercentage
     *      print output showing taxed amount and new total.
     *
     * else if = Illinois
     *      taxPercentage = illinoisStateTax
     *      print output showing taxed amount and new total.
     *
     * else
     *      print output showing only total.
     *
     *
     * Print Method
     * taxedAmount = subTotal * taxPercentage
     * totalAmount = subTotal + (taxedAmount) (rounded to nearest cent)
     */

    public static void main(String[] args) {
        final double WISCONSIN_STATE_TAX = .05;
        final double ILLINOIS_STATE_TAX = .08;

        System.out.print("What is the order amount? ");
        double subTotal = Double.parseDouble(isNumeric());

        System.out.print("What is the state? ");
        String state = getInput();

        double taxPercentage;

        if (state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Wisconsin")) {
            taxPercentage = getWisconsinCountyTax(WISCONSIN_STATE_TAX);
            printTaxedStates(subTotal, taxPercentage);
        }
        else if (state.equalsIgnoreCase("IL") || state.equalsIgnoreCase("Illinois")){
            taxPercentage = ILLINOIS_STATE_TAX;
            printTaxedStates(subTotal, taxPercentage);
        }
        else{
            System.out.printf("The total is $%.2f.%n", subTotal);
        }
    }

    public static String getInput(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static String isNumeric(){
        Scanner input = new Scanner(System.in);
        boolean numeric = input.hasNextDouble();
        String answer = input.nextLine();
        while (!numeric) {
            System.out.print("Please answer with numeric values only: ");
            numeric = input.hasNextDouble();
            answer = input.nextLine();
        }
        return answer;
    }

    public static double getWisconsinCountyTax(double wisconsinStateTax){
        System.out.print("Which county do you live in? Eau Claire or Dunn? ");
        String county = getInput();

        if (county.equalsIgnoreCase("Eau Claire")) {
            wisconsinStateTax += .005; //5% Eau Clair county tax
        }
        else if (county.equalsIgnoreCase("Dunn")){
            wisconsinStateTax += .004; //4% Dunn country tax
        }
        else{
            wisconsinStateTax = 0;
        }
        return wisconsinStateTax;
    }

    public static void printTaxedStates(double subTotal, double taxPercentage){
        double taxedAmount = subTotal * taxPercentage;;
        double totalAmount = Math.ceil((subTotal + taxedAmount) * 100)/100;
        System.out.printf("The tax is: $%.2f.%nThe total is: $%.2f%n", taxedAmount, totalAmount);
    }
}
