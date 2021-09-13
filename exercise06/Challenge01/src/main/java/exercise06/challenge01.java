package exercise06;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.time.Year;
import java.util.Scanner;

public class challenge01 {

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
        return x - y;
    }

    public static void getRetireYear(int yearsToRetire){
        int currentYear = Year.now().getValue();
        int retireYear = yearsToRetire + currentYear;

        if (yearsToRetire > 0){
            System.out.printf("You have %d years left until you can retire.%n", yearsToRetire);
            System.out.printf("It's %d, so you can retire in %d.%n", currentYear, retireYear);
        }
        else{
            System.out.println("You can already retire!!!");
            System.out.printf("It's %d, your old ass could have retired in %d.%n", currentYear, retireYear);
        }
    }
}