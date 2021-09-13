package exercise18;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution18 {

    /*
     * Pseudocode:
     * Prompt user "Press C to convert from Fahrenheit to Celsius."
     * Prompt user "Press F to convert from Celsius to Fahrenheit."
     * scan in answer
     *
     * if answer == C
     *     letter = "C"
     * else
     *     letter = "F"
     *
     * Print "Your choice: 'letter'
     *
     * if answer == C (ignore case sensitivity)
     *      Prompt user "Please enter the temperature in Fahrenheit:"
     *      scan in answer
     *      temp = ('answer' − 32) × 5 / 9 //Celsius
     *      scale = Celsius
     * else
     *      Prompt user "Please enter the temperature in Celsius:"
     *      scan in answer
     *      temp = ('answer' × 9 / 5) + 32 //Fahrenheit
     *      scale = Fahrenheit
     *
     * print "The temperature in 'scale' is 'temp'
     *
     */

    public static void main(String[] args) {

        System.out.printf("Press C to convert from Fahrenheit to Celsius.%n" +
                "Press F to convert from Celsius to Fahrenheit.%n" +
                "Your choice: ");

        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        answer = checkValid(answer);
        printTemp(answer);
    }

    public static String checkValid (String answer){
        while (!answer.equalsIgnoreCase("C") && !answer.equalsIgnoreCase("F")){
            System.out.print("Invalid entry, please try again: ");
            Scanner input = new Scanner(System.in);
            answer = input.nextLine();
        }
        return answer;
    }

    public static void printTemp (String answer){
        Scanner input = new Scanner(System.in);
        double finalTemp = 0;
        String scale;

        if (answer.equalsIgnoreCase("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double temp = Double.parseDouble(input.nextLine());
            finalTemp = ((temp - 32) * .5556); //to Celsius
            scale = "Celsius";
        }
        else{
            System.out.print("Please enter the temperature in Celsius: ");
            double temp = Double.parseDouble(input.nextLine());
            finalTemp = (temp * (1.8)) + 32; //to Fahrenheit
            scale = "Fahrenheit";
        }

        System.out.printf("The temperature in %s is %.1f.%n", scale, finalTemp);
    }

}
