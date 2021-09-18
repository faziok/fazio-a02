package exercise16;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */


import java.util.Scanner;

public class Solution16 {
    Scanner input = new Scanner(System.in);
    private  static final int LEGAL_AGE = 16;

    /*
     * Pseudocode:
     * declare constant LEGAL_AGE to be 16
     *
     * Prompt user "What is your age?"
     * scan in integer
     *
     * if age >= 16
     *  print "You are old enough to legally drive."
     * else
     *  print "You are not old enough to legally drive."
     */

    public static void main(String[] args) {
        Solution16 ageLimit = new Solution16();

        int userAge = Integer.parseInt(ageLimit.isScanInputNumeric("What is your age? "));

        userAge = ageLimit.inRange(userAge);

        printOutput(userAge, LEGAL_AGE);
    }

    public static void printOutput (int age, int legalAge){
        System.out.println(age >= legalAge ? "You are old enough to legally drive." :
                "You are NOT old enough to legally drive.");
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

    public int inRange (int userAge){
        while (userAge < 0){
            userAge = Integer.parseInt(isScanInputNumeric("Please enter an age greater than 0: "));
        }
        return userAge;
    }
}
