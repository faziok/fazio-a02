package exercise07;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution07 {

    /*
    * Create a program that calculates the area of a room.
    * Prompt the user for the length and width of the room in feet.
    * Then display the area in both square feet and square meters.

    * Example Output:
        What is the length of the room in feet? 15
        What is the width of the room in feet? 20
        You entered dimensions of 15 feet by 20 feet.
        The area is
        300 square feet
        27.871 square meters

    * The formula for this conversion is m2 = f2 × 0.09290304

    * Constraints:
    * -Keep the calculations separate from the output.
    * -Use a constant to hold the conversion factor.
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
        final double CONVERSION_FACTOR = 0.09290304;

        System.out.print("What is the length of the room in feet? ");
        int length = scanIntInput();

        System.out.print("What is the width of the room in feet? ");
        int width = scanIntInput();

        System.out.printf("You entered dimensions of %d feet by %d feet.%n", length, width);

        int squareFeet = length * width;
        double squareMeters = squareFeet * CONVERSION_FACTOR;

        System.out.println("The area is:");
        System.out.printf("%d square feet%n%.3f square meters%n", squareFeet, squareMeters);

    }

    public static int scanIntInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
