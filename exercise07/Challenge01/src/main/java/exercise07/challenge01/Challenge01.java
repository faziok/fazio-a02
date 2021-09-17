package exercise07.challenge01;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Challenge01 {
    Scanner input = new Scanner(System.in);

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
    *
    * get square feet
    * get square meters using formula m^2 = f^2 * 0.09290304
    *
    * print "You entered dimensions of 'length' feet by 'width' feet."
    * print "The area is:"
    * print "'squareFeet' square feet"
    * print "'squareMeters' square meters"
     */

    public static void main(String[] args) {
        Challenge01 area = new Challenge01();

        double length = Double.parseDouble(area.scanInput("What is the length of the room in feet? "));
        double width = Double.parseDouble(area.scanInput("What is the width of the room in feet? "));
        double squareFeet = area.getSquareFeet(length, width);
        double squareMeters = area.getSquareMeters(squareFeet);

        System.out.printf("You entered dimensions of %.1f feet by %.1f feet.%n", length, width);
        System.out.printf("The area is:%n%.1f square feet%n%.1f square meters%n",
                squareFeet, squareMeters);
    }

    public String scanInput(String prompt){
        System.out.print(prompt);
        return isNumeric();
    }

    public double getSquareFeet(double l, double w){
        return l * w;
    }

    public double getSquareMeters(double feet){
        final double CONVERSION_FACTOR = 0.09290304;
        return feet * CONVERSION_FACTOR;
    }

    public String isNumeric(){
        boolean numeric = input.hasNextDouble();
        String answer = input.nextLine();

        while (!numeric){
            System.out.print("Please answer with a positive numeric values only: ");
            numeric = input.hasNextDouble();
            answer = input.nextLine();
        }
        return answer;
    }
}