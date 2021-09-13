package exercise18;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution18 {

    /*
     * Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
     * Prompt for the starting temperature.
     * The program should prompt for the type of conversion and then perform the conversion.
     *
     * The formulas are:
     * C = (F − 32) × 5 / 9
     * and
     * F = (C × 9 / 5) + 32
     *
     * Example Output
     * Press C to convert from Fahrenheit to Celsius.
     * Press F to convert from Celsius to Fahrenheit.
     * Your choice: C
     * Please enter the temperature in Fahrenheit: 32
     * The temperature in Celsius is 0.
     *
     * Constraints
     * -Ensure that you allow upper or lowercase values for C and F.
     * -Use as few output statements as possible and avoid repeating output strings.
     *
     *---------------
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

        answer = checkAnswer(answer);
        printTemp(answer);
    }

    public static String checkAnswer (String answer){
        while (!answer.equalsIgnoreCase("C") && !answer.equalsIgnoreCase("F")){
            System.out.print("Invalid entry, please try again: ");
            Scanner input = new Scanner(System.in);
            answer = input.nextLine();
        }
        return answer;
    }

    public static void printTemp (String answer){
        double finalTemp = 0;
        String letter;

        if (answer.equalsIgnoreCase("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double temp = Double.parseDouble(isNumeric());
            finalTemp = ((temp - 32) * .5556); //to Celsius
            letter = "C";
        }
        else{
            System.out.print("Please enter the temperature in Celsius: ");
            double temp = Double.parseDouble(isNumeric());
            finalTemp = (temp * (1.8)) + 32; //to Fahrenheit
            letter = "F";
        }

        System.out.printf("The temperature in %s is %.1f.%n", letter, finalTemp);
    }

    public static String isNumeric(){
        Scanner input = new Scanner(System.in);
        boolean numeric = input.hasNextDouble();
        String answer = input.nextLine();

        while (!numeric) {
            System.out.print("Please answer with numeric values only: ");
            numeric = input.hasNextDouble();
            answer = input.nextLine();
        }
        return answer;
    }
}
