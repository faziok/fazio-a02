package exercise06;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import javax.print.attribute.standard.PrinterResolution;
import java.time.Year;
import java.util.Scanner;

public class challenge01 {
    Scanner input = new Scanner(System.in);

    /*
    ***CHALLENGE: Handle situations where the program returns a negative number
    *       by stating that the user can already retire.***
    *
    *Pseudocode:
    * Prompt user "What is your current age?"
    * scan in user input
    *
    * Prompt user "At what age would you like to retire?"
    * scan in user input
    *
    * convert strings to integers
    *
    * yearsLeft = retirementAge - currentAge
    *
    * get current year from system
    * int retirementYear = currentYear + yearsLeft
    *
    *  if yearsleft > 0
    *   print "You have 'yearsLeft' years left until you can retire."
    *   print "It's 'currentYear', so you can retire in 'retireYear'."
    * else
    *   print "You can already retire!!!"
    *   print "It's 'currentYear', you could have retired in retirementYear'."
    */

    public static void main(String[] args) {
        challenge01 retirement = new challenge01();

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

    public void printOutput(String output){
        System.out.print(output);
    }

    public int getYearsLeft(int x, int y){
        return x - y;
    }

    public void getRetireYear(int yearsToRetire){
        int currentYear = Year.now().getValue();
        int retireYear = yearsToRetire + currentYear;

        if (yearsToRetire > 0){
            printOutput(String.format("You have %d years left until you can retire.%n" +
                    "It's %d, so you can retire in %d.%n", yearsToRetire, currentYear, retireYear));
        }
        else{
            printOutput(String.format("You can already retire!!!%n" +
                    "It's %d, your old ass could have retired in %d.%n", currentYear, retireYear));
        }
    }
}