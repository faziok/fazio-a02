package exercise06;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.time.Year;
import java.util.Scanner;

public class Solution06 {
    private static final Scanner input = new Scanner(System.in);
    /*
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
        Solution06 retirement = new Solution06();


        String age = retirement.scanStringInput("What is your current age? ");
        String retire = retirement.scanStringInput("At what age would you like to retire? ");

        int currentAge = Integer.parseInt(age);
        int retireAge = Integer.parseInt(retire);

        retirement.getRetireYear(retirement.getYearsLeft(retireAge, currentAge));
    }

    public String scanStringInput(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    public int getYearsLeft(int x, int y){
        int difference = x - y;
        System.out.printf("You have %d years left until you can retire.%n", difference);
        return difference;
    }

    public void getRetireYear(int x){
        int currentYear = Year.now().getValue();
        int retireYear = x + currentYear;
        System.out.printf("It's %d, so you can retire in %d.%n", currentYear, retireYear);
    }
}
