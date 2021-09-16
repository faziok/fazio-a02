package exercise22;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution22 {

    /*
     * Pseudocode:
     * Prompt user "Enter first number"
     * scan input
     * Prompt user "Enter second number"
     * scan input
     * Prompt user "Enter third number"
     * scan input
     *
     * double largestNumber
     *
     * //Check if numbers are all different
     * if N1 == N2 or N1 == N3 or N2 == N3
     *      system.exit(0)
     * else
     *      //check for largest number
     *      if N1 > N2 && N1 > N3
     *          largestNumber = N1
     *      else if N2 > N3
     *          largestNumber = N2
     *      else
     *          largest number = N3
     *
     * output "The largest number is 'largestNumber'."
     */

    public static void main(String[] args) {
        Solution22 largest = new Solution22();

        System.out.print("Enter first number: ");
        double numberOne = Double.parseDouble(largest.isNumeric());

        System.out.print("Enter second number: ");
        double numberTwo = Double.parseDouble(largest.isNumeric());

        System.out.print("Enter third number: ");
        double numberThree = Double.parseDouble(largest.isNumeric());


        System.out.printf("The largest number is %.1f.%n",
                largest.answer(numberOne, numberTwo, numberThree));

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

    public double answer(double n1, double n2, double n3){
        double largestNumber = 0;

        if (n1 == n2 || n1 == n3 || n2 == n3){
            System.exit(0);
        }
        else{
            if (n1 > n2 && n1 > n3){
                largestNumber = n1;
            }
            else largestNumber = Math.max(n2, n3);
        }
        return largestNumber;
    }
}
