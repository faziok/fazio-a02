package exercise09;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution09 {

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
        final int ONE_GALLON = 350; //one gallon covers 350 square feet

        System.out.print("What is the length of the ceiling? ");
        int length = intInput();

        System.out.print("What is the width of the ceiling? ");
        int width = intInput();

        int area = getArea(length, width);

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.%n",
                getTotalGallons(area, ONE_GALLON), area);
    }

    public static int intInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int getArea(int l, int w){
        return l * w;
    }

    public static int getTotalGallons(int area, int gallon){
        double gallons = area / (double) gallon;
        return (int) Math.ceil(gallons);
    }
}
