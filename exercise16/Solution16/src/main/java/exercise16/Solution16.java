package exercise16;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */


import java.util.Scanner;

public class Solution16 {

    /*
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
