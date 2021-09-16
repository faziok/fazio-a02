package exercise21;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution21 {

    /*
     * Pseudocode:
     * Prompt user "Please enter the number of the month:"
     * scan in string month
     * (check if it is numeric, parse to int)
     *
     * declare string 'message'
     *
     * Switch monthString
     *  case1 = "January"
     *  case2 = "February"
     *  .
     *  .
     *  .
     *  case12 = "December"
     *  default = "Error: "
     *
     * if 1 > month >12
     *      message = "Error: "
     * else
     *      message = "The name of the month is "
     *
     *  output "'message' 'month'."
     */

    public static void main(String[] args) {
        Solution21 theMonth = new Solution21();

        System.out.print("Please enter the number of the month: ");
        int month = Integer.parseInt(theMonth.isNumeric());
        String message;

        String monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };

        if (month < 0 || month > 12){
            message = "Error: ";
        }
        else{
            message = "The name of the month is ";
        }

            System.out.printf("%s%s.%n", message, monthString);
    }

    public String isNumeric(){
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
}
