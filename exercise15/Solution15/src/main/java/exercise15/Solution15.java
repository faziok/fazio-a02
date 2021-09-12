package exercise15;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution15 {

    /*
     * Create a simple program that validates user login credentials.
     * The program must prompt the user for a username and password.
     * The program should compare the password given by the user to a known password.
     * If the password matches, the program should display "Welcome!"
     * If it doesn’t match, the program should display "I don’t know you."
     *
     * Example Output
     * What is the password? 12345
     * I don't know you.
     *
     * Or
     *
     * What is the password? abc$123
     * Welcome!
     *
     * Constraints
     * -Use an if/else statement for this problem.
     * -Make sure the program is case sensitive.
     *
     ---------------------
     * Pseudocode:
     * Prompt user "What is your username?"
     *
     * Prompt user "What is your password?"
     * scan in String
     *
     * If Sting.equals(abc$123)
     *      print "Welcome!"
     * else
     *      print "I don't know you."
     *
     */

    public static void main(String[] args) {
        System.out.print("What is your username? ");
        Scanner inputName = new Scanner(System.in);
        String userName = inputName.nextLine();

        System.out.print("What is your password? ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        if (password.equals("abc$123")){
            System.out.printf("Welcome!%n");
        }
        else{
            System.out.printf("I don't know you.%n");
        }
    }
}
