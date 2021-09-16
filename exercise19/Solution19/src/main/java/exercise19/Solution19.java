package exercise19;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution19 {

    /*
     * Pseudocode
     * Prompt user "Enter height (in inches):"
     * scan in height/validate input is numeric
     *
     * Prompt user "Enter weight (in pounds):"
     * scan in weight/validate input in numeric
     *
     * calculate BMI = (weight / (height × height)) * 703
     * Print "Your BMI is 'bmi'."
     *
     * if bmi >= 18.5 && bmi <= 25
     *      print "You are within the ideal weight range. You eat the perfect amount of french fries!"
     * else if bmi < 18.5
     *      print "You are underweight! Eat some french fries and go see your doctor."
     * else
     *      Print "You are overweight! Eat less french fries and go see your doctor."
     *
    */

    public static void main(String[] args) {
        Solution19 body = new Solution19();

        System.out.print("Enter your height (in inches): ");
        double height = Double.parseDouble(body.isNumeric());

        System.out.print("Enter your weight (in pounds): ");
        double weight = Double.parseDouble(body.isNumeric());

        double bmi = body.getBMI(height, weight);

        System.out.printf("Your BMI is %.1f%n%s%n", bmi, body.getRecommendation(bmi));


    }

    public double getBMI (double height, double weight){
        return (weight / (Math.pow(height, 2))) * 703;
    }

    public String getRecommendation (double bmi){
        String recommendation;

        if (bmi >= 18.5 && bmi <= 25){
            recommendation = "You are within the ideal weight range. You eat the perfect amount of french fries!";
        }
        else if (bmi < 18.5){
            recommendation = "You are underweight! Eat some french fries and go see your doctor.";
        }
        else {
            recommendation = "You are overweight! Eat less french fries and go see your doctor.";
        }
        return recommendation;
    }

    public String isNumeric(){
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
