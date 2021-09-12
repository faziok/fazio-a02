package exercise16;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */


import java.util.Scanner;

public class Solution16 {

    /*
     * Write a program that asks the user for their age and compare it to the legal driving age of sixteen.
     * If the user is sixteen or older, then the program should display "You are old enough to legally drive."
     * If the user is under sixteen, the program should display "You are not old enough to legally drive."
     *
     * Example Output
     * What is your age? 15
     * You are not old enough to legally drive.
     *
     * Or
     *
     * What is your age? 35
     * You are old enough to legally drive.
     *
     * Constraints:
     * -Use a single output statement.
     * -Use a ternary operator to write this program. If your language doesn’t support a ternary operator,
     *     use a regular if/else statement, and still use a single output statement to display the message.
     *
     --------------
     * Pseudocode:
     * declare constant LEGAL_AGE to be 16
     *
     * Prompt user "What is your age?"
     * scan in integer
     *
     * if age >= 16
     *  print "You are old enough to legally drive."
     * else
     *  print "You are not old enough to legally drive."
     */



    public static void main(String[] args) {
        final int LEGAL_AGE = 16;

        System.out.print("What is your age? ");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();

        System.out.printf(userAge >= LEGAL_AGE ? "You are old enough to legally drive.%n" :
                "You are NOT old enough to legally drive.%n");
    }
}
