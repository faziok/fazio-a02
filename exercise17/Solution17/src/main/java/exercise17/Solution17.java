package exercise17;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution17 {

    /*
     * Create a program that prompts for your weight, gender, total alcohol consumed (in ounces),
     * and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula
     *
     * BAC = (A × 5.14 / W × r) − .015 × H
     * where:
     * A is total alcohol consumed, in ounces (oz).
     * W is body weight in pounds.
     * r is the alcohol distribution ratio:
     * 0.73 for men
     * 0.66 for women
     * H is number of hours since the last drink.
     *
     * Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.
     *
     * Example Output:
     * Enter a 1 if you are male or a 2 if you are female: 1
     * How many ounces of alcohol did you have? 3
     * What is your weight, in pounds? 175
     * How many hours has it been since your last drink? 1
     *
     * Your BAC is 0.049323
     * It is legal for you to drive.
     *
     * OR
     *
     * Enter a 1 if you are male or a 2 if you are female: 1
     * How many ounces of alcohol did you have? 5
     * What is your weight, in pounds? 175
     * How many hours has it been since your last drink? 1
     *
     * Your BAC is 0.092206
     * It is not legal for you to drive.
     *
     * Constraint:
     * -Prevent the user from entering non-numeric values.
     *
     ---------------
     * Pseudocode:
     * Prompt user "Enter a 1 if you are male or a 2 if you are female:"
     * scan integer/check input is only numeric, if not, ask again.
     *      while not a numeric, prompt user "Please answer with numeric answers only: "
     * check if response is 1>x>2
     *
     * Prompt user "How many OUNCES of alcohol did you have?"
     * scan integer/check input is only numeric, if not, ask again.
     *
     * Prompt user "What is your weight, in pounds?"
     * scan integer/check input is only numeric, if not, ask again.
     *
     * Prompt user "How many hours has it been since your last drink?"
     * scan integer/check input is only numeric, if not, ask again.
     *
     * calculate BAC using the formula above
     *
     * if BAC < .08
     *  print "Your BAC is 'BAC'"
     *  print "It is legal for you to drive."
     * else
     *  print "Your BAC is 'BAC'"
     *  print "It is NOT legal for you to drive."
     *
     */


    public static void main(String[] args) {
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        double gender = Double.parseDouble(isNumeric());
        gender = checkGender(gender);

        System.out.print("How many OUNCES of alcohol did you have? ");
        double ounces = Double.parseDouble(isNumeric());

        System.out.print("What is your weight, in pounds? ");
        double weight = Double.parseDouble(isNumeric());

        System.out.print("How many hours has it been since your last drink? ");
        double hours = Double.parseDouble(isNumeric());

        double bloodAC = getBAC(gender, ounces, weight, hours);

        if (bloodAC < .08 ){
            System.out.printf("Your BAC is %.6f%nIt is legal for you to drive.%n", bloodAC);
        }
        else{
            System.out.printf("Your BAC is %.6f%nIt is NOT legal for you to drive.%n", bloodAC);
        }

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

    public static double checkGender(double gender){
        Scanner input = new Scanner(System.in);

        while (gender < 1 || gender > 2){
            System.out.print("Try again, 1 if you are male or a 2 if you are female: ");
            gender = input.nextDouble();
        }
        return gender;
    }

    public static double getBAC(double gender, double ounces, double weight, double hours){
        double ratio = .73; //male alcohol distribution ratio
        if(gender == 2){
            ratio = .66; //female alcohol distribution ratio
        }
        return ((((ounces * 5.14) / weight) * ratio) - (.015 * hours));
    }
}
