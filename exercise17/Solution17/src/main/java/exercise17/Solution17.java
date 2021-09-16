package exercise17;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution17 {

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

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        double gender = Double.parseDouble(alcohol.isNumeric());
        gender = alcohol.checkGender(gender);

        System.out.print("How many OUNCES of alcohol did you have? ");
        double ounces = Double.parseDouble(alcohol.isNumeric());

        System.out.print("What is your weight, in pounds? ");
        double weight = Double.parseDouble(alcohol.isNumeric());

        System.out.print("How many hours has it been since your last drink? ");
        double hours = Double.parseDouble(alcohol.isNumeric());

        double bloodAC = alcohol.getBAC(gender, ounces, weight, hours);
        alcohol.printResult(bloodAC);

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

    public double checkGender(double gender){
        Scanner input = new Scanner(System.in);

        while (gender < 1 || gender > 2){
            System.out.print("Try again, 1 if you are male or a 2 if you are female: ");
            gender = input.nextDouble();
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
