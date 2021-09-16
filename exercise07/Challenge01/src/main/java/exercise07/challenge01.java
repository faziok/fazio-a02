package exercise07;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class challenge01 {

    /*
    ***CHALLENGE01: Revise the program to ensure that inputs are entered as numeric values.
        Don’t allow the user to proceed if the value entered is not numeric.***
    ----------------------------------------------------------------------------
    * Pseudocode:
    * declare CONVERSION_FACTOR constant
    *
    * Prompt user: "What is the length of the room in feet?"
    * scan user input
    *
    * Prompt user: "What is the width of the room in feet?"
    * scan in user input
    *
    * print "You entered dimensions of 'length' feet by 'width' feet."
    *
    * get square feet
    * get square meters using formula m^2 = f^2 * 0.09290304
    *
    * print "The area is:"
    * print "'squareFeet' square feet"
    * print "'squareMeters' square meters"

     */

    public static void main(String[] args) {
        challenge01 area = new challenge01();

        final double CONVERSION_FACTOR = 0.09290304;

        System.out.print("What is the length of the room in feet? ");
        Double length = Double.parseDouble(area.isNumeric());

        System.out.print("What is the width of the room in feet? ");
        Double width = Double.parseDouble(area.isNumeric());

        System.out.printf("You entered dimensions of %.1f feet by %.1f feet.%n", length, width);

        double squareFeet = length * width;
        double squareMeters = squareFeet * CONVERSION_FACTOR;

        System.out.println("The area is:");
        System.out.printf("%.1f square feet%n%.1f square meters%n", squareFeet, squareMeters);

    }

    public String isNumeric(){
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
}
