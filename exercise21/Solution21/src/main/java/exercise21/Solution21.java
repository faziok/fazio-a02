package exercise21;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution21 {

    /*
     * Write a program that converts a number from 1 to 12 to the corresponding month.
     * Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December.
     * For any value outside that range, display an appropriate error message.
     *
     * Example Output
     * Please enter the number of the month: 3
     * The name of the month is March.
     *
     * Constraints
     * -Use a switch or case statement for this program.
     * -Use a single output statement for this program.
     *
     * Pseudocode:
     * Prompt user "Please enter the number of the month:"
     * scan in string month
     * (check if it is numeric, parse to int)
     *
     * Switch monthString
     *  case1 = January
     *  case2 = February
     *  .
     *  .
     *  .
     *  case12 = December
     *  default = "Error: Invalid month"
     *
     *  output "The name of the month is 'month'"
     */
    public static void main(String[] args) {
        System.out.print("Please enter the number of the month: ");
        int month = Integer.parseInt(isNumeric());
        int output = 1;
        String message;

        String monthString = switch (month) {
            case 1 -> "The name of the month is January";
            case 2 -> "The name of the month is February";
            case 3 -> "The name of the month is March";
            case 4 -> "The name of the month is April";
            case 5 -> "The name of the month is May";
            case 6 -> "The name of the month is June";
            case 7 -> "The name of the month is July";
            case 8 -> "The name of the month is August";
            case 9 -> "The name of the month is September";
            case 10 -> "The name of the month is October";
            case 11 -> "The name of the month is November";
            case 12 -> "The name of the month is December";
            default -> "Error: Invalid month";
        };

            System.out.println(monthString);
    }

    public static String isNumeric(){
        Scanner input = new Scanner(System.in);
        boolean numeric = input.hasNextDouble();
        String number = input.nextLine();
        while (!numeric) {
            System.out.print("Please answer with numeric values only: ");
            numeric = input.hasNextDouble();
            number = input.nextLine();
        }
        return number;
    }

    /*
    //Check if input is in range
    public static int inRange(int number){
        while (number < 1 || number > 12){
            System.out.print("Please enter a number 1-12 for the month: ");
            number = Integer.parseInt(isNumeric());
        }
        return number;
    }
     */
}
