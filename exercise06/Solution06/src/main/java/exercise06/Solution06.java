package exercise06;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.time.Year;
import java.util.Scanner;

public class Solution06 {

    /*
    * Create a program that determines how many years you have left until retirement and the year you can retire.
        It should prompt for your current age and the age you want to retire.
        Display the output as shown in the example that follows.

    * What is your current age? 25
    * At what age would you like to retire? 65
    * You have 40 years left until you can retire.
    * It's 2015, so you can retire in 2055.
    *
    * Constraints:
    * -Again, be sure to convert the input to numerical data before doing any math.
    * -Don’t hard-code the current year into your program. Get it from the system time via your programming language.

    *Pseudocode:
    * Prompt user "What is your current age?"
    * scan in user input (method)
    *
    * Prompt user "At what age would you like to retire?"
    * scan in user input (method)
    *
    * int yearsLeft = retirementAge - currentAge
    * int currentYear = get current year from system
    * int retirementYear = currentYear + yearsLeft
    *
    * convert strings into integers. (method)
    *
    * print "You have 'yearsLeft' years left until you can retire."
    * print "It's 'currentYear', so you can retire in 'retireYear'."
     */

    public static void main(String[] args) {
        System.out.print("What is your current age? ");
        String currentAge = scanStringInput();

        System.out.print("At what age would you like to retire? ");
        String retirementAge = scanStringInput();

        int yearsLeft = toInteger(retirementAge) - toInteger(currentAge);
        int currentYear = Year.now().getValue();
        int retireYear = currentYear + yearsLeft;

        System.out.printf("You have %d years left until you can retire.%n", yearsLeft);
        System.out.printf("It's %d, so you can retire in %d.%n", currentYear, retireYear);
    }

    public static String scanStringInput(){
        Scanner inputX = new Scanner(System.in);
        String Y = inputX.nextLine();
        return Y;
    }

    public static int toInteger(String X){
        int Y = Integer.parseInt(X);
        return Y;
    }
}
