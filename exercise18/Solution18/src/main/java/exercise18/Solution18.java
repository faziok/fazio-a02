package exercise18;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution18 {
    Scanner input = new Scanner(System.in);

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
     */

    public static void main(String[] args) {
        Solution18 convert = new Solution18();

        String answer = convert.getResponse(String.format("Press C to convert from Fahrenheit to Celsius.%n" +
                "Press F to convert from Celsius to Fahrenheit.%n" +
                "Your choice: "));

        convert.printTemp(convert.checkValid(answer));
    }

    public String getResponse(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    public String checkValid (String answer){
        while (!answer.equalsIgnoreCase("C") && !answer.equalsIgnoreCase("F")){
            answer = getResponse("Invalid entry, please try again: ");
        }
        return answer;
    }

    public void printTemp (String answer){
        double temp;
        double finalTemp;
        String scale;

        if (answer.equalsIgnoreCase("C")){ //change to celsius
            temp = Double.parseDouble(getResponse("Please enter the temperature in Fahrenheit: "));
            finalTemp = ((temp - 32) * .5556);
            scale = "Celsius";
        }
        else{ //change to fahrenheit
            temp = Double.parseDouble(getResponse("Please enter the temperature in Celsius: "));
            finalTemp = (temp * (1.8)) + 32;
            scale = "Fahrenheit";
        }

        System.out.printf("The temperature in %s is %.1f degrees.%n", scale, finalTemp);
    }
}
