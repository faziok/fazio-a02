package exercise07;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution07 {

    /*
    * Pseudocode:
    * Prompt user: "What is the length of the room in feet?"
    * scan user input
    *
    * Prompt user: "What is the width of the room in feet?"
    * scan in user input
    *
    * print "You entered dimensions of 'length' feet by 'width' feet."
    *
    * get square feet (l * w)
    * get square meters using constant 0.09290304 * square feet
    *
    * print "The area is:%n 'squareFeet' square feet %n 'squareMeters' square meters"
     */

    public static void main(String[] args) {
        System.out.print("What is the length of the room in feet? ");
        double length = Double.parseDouble(scanIntInput());

        System.out.print("What is the width of the room in feet? ");
        double width = Double.parseDouble(scanIntInput());

        System.out.printf("You entered dimensions of %.1f feet by %.1f feet.%n", length, width);

        double squareFeet = getSquareFeet(length, width);
        double squareMeters = getSquareMeters(squareFeet);

        System.out.printf("The area is:%n%.1f square feet%n%.1f square meters%n", squareFeet, squareMeters);

    }

    public static String scanIntInput(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static double getSquareFeet(double l, double w){
        return l * w;
    }

    public static double getSquareMeters(double feet){
        final double CONVERSION_FACTOR = 0.09290304;
        return feet * CONVERSION_FACTOR;
    }
}
