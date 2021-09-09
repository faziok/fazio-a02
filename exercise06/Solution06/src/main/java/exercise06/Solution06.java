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
    ----------------
    *Pseudocode:
    * Prompt user "What is your current age?"
    * scan in user input
    *
    * Prompt user "At what age would you like to retire?"
    * scan in user input
    *
    * convert input to integers
    *
    * int yearsLeft = retirementAge - currentAge
    * print "You have 'yearsLeft' years left until you can retire."
    *
    * get current year from system
    * int retirementYear = currentYear + yearsLeft
    * print "It's 'currentYear', so you can retire in 'retireYear'."
    */

    public static void main(String[] args) {
        System.out.print("What is your current age? ");
        String age = scanStringInput();

        System.out.print("At what age would you like to retire? ");
        String retire = scanStringInput();

        int currentAge = Integer.parseInt(age);
        int retireAge = Integer.parseInt(retire);

        getRetireYear(getYearsLeft(retireAge, currentAge));
    }

    public static String scanStringInput(){
        Scanner inputX = new Scanner(System.in);
        return inputX.nextLine();
    }

    public static int getYearsLeft(int x, int y){
        int difference = x - y;
        System.out.printf("You have %d years left until you can retire.%n", difference);
        return difference;
    }

    public static void getRetireYear(int x){
        int currentYear = Year.now().getValue();
        int retireYear = x + currentYear;
        System.out.printf("It's %d, so you can retire in %d.%n", currentYear, retireYear);
    }
}
