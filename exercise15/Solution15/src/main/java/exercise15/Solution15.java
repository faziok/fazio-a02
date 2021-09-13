package exercise15;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution15 {

    /*
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
            System.out.printf("Welcome, %s!%n", userName);
        }
        else{
            System.out.printf("I don't know you, %s.%n", userName);
        }
    }
}
