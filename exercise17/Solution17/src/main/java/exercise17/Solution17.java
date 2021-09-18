package exercise17;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution17 {
    Scanner input = new Scanner(System.in);

    /*
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
        Solution17 alcohol = new Solution17();

        double gender = alcohol.checkGender(Double.parseDouble(alcohol.isScanInputNumeric
                ("Enter a 1 if you are male or a 2 if you are female: ")));

        double ounces = Double.parseDouble(alcohol.isScanInputNumeric("How many OUNCES of alcohol did you have? "));
        double weight = Double.parseDouble(alcohol.isScanInputNumeric("What is your weight, in pounds? "));
        double hours = Double.parseDouble(alcohol.isScanInputNumeric("How many hours has it been " +
                "since your last drink? "));

        double bloodAC = alcohol.getBAC(gender, ounces, weight, hours);
        alcohol.printResult(bloodAC);

    }

    public String isScanInputNumeric(String prompt){
        System.out.print(prompt);
        boolean numeric = input.hasNextDouble();
        String answer = input.nextLine();

        while (!numeric){
            System.out.print("Please answer with numeric values only: ");
            numeric = input.hasNextDouble();
            answer = input.nextLine();
        }
        return answer;
    }

    public double checkGender(double gender){
        while (gender < 1 || gender > 2){
            gender = Double.parseDouble(isScanInputNumeric("Try again, 1 if you are male or a 2 if you are female: "));
        }
        return gender;
    }

    public double getBAC(double gender, double ounces, double weight, double hours){
        double ratio = .73; //male alcohol distribution ratio
        if(gender == 2){
            ratio = .66; //female alcohol distribution ratio
        }
        return ((((ounces * 5.14) / weight) * ratio) - (.015 * hours));
    }

    public void printResult(double bloodAlcoholContent){
        if (bloodAlcoholContent < .08 ){
            System.out.printf("Your BAC is %.6f%nIt is legal for you to drive.%n", bloodAlcoholContent);
        }
        else{
            System.out.printf("Your BAC is %.6f%nIt is NOT legal for you to drive.%n", bloodAlcoholContent);
        }
    }
}
