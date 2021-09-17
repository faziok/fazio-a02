package exercise09;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution09 {
    Scanner input = new Scanner(System.in);
    private static final int ONE_GALLON = 350; //one gallon covers 350 square feet

    /*
     * Pseudocode:
     * prompt user for length of ceiling
     * scan input
     *
     * prompt user for width of ceiling
     * scan input
     *
     * get area = l * w
     * total gallons needed = area / constant
     * round up integer
     *
     * print "You will need to purchase 'totalGallons' gallons of paint to cover 'area' square feet."
     */

    public static void main(String[] args) {
        Solution09 gallons = new Solution09();

        int length = Integer.parseInt(gallons.scanInput("What is the length of the ceiling? "));
        int width = Integer.parseInt(gallons.scanInput("What is the width of the ceiling? "));

        int area = gallons.getArea(length, width);

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.%n",
                gallons.getTotalGallons(area, ONE_GALLON), area);
    }

    public String scanInput(String prompt){
        System.out.print(prompt);
        return isNumeric();
    }

    public String isNumeric(){
        boolean numeric = input.hasNextDouble();
        String answer = input.nextLine();

        while (!numeric){
            System.out.print("Please answer with numeric values only: ");
            numeric = input.hasNextDouble();
            answer = input.nextLine();
        }
        return answer;
    }

    public int getArea(int l, int w){
        return l * w;
    }

    public int getTotalGallons(int area, int gallon){
        double gallons = area / (double) gallon;
        return (int) Math.ceil(gallons);
    }
}
