package exercise08;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution08 {

    /*
     * Write a program to evenly divide pizzas.
     * Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
     * Ensure that the number of pieces comes out even.
     * Display the number of pieces of pizza each person should get.
     * If there are leftovers, show the number of leftover pieces.

        *Example Output
        How many people? 8
        How many pizzas do you have? 2
        How many slices per pizza? 8
        8 people with 2 pizzas (16 slices)
        Each person gets 2 pieces of pizza.
        There are 0 leftover pieces.

     ----------------
     * Pseudocode:
     * Prompt user "How many people?"
     * scan input
     *
     * Prompt user "How many pizzas do you have?"
     * scan input
     *
     * Prompt user "How many slices per pizza?"
     * scan input
     * If odd number prompt user to enter an even number
     * If even continue
     *
     * get total number of slices = pieces * pizzas
     * get number of slices per person = totalSlices / totalPeople
     * get remainder = totalSlices % totalPeople
     *
     * print "'totalPeople' people with 'totalPizzas' pizzas ('totalSlices' slices)"
     * print "Each person gets 'slicesPP' pieces of pizza."
     * print "There are 'remainder' leftover pieces."
     *
     */



    public static void main(String[] args) {
        System.out.print("How many people? ");
        int totalPeople = intInput();

        System.out.print("How many pizzas do you have? ");
        int totalPizzas = intInput();

        System.out.print("How many slices per pizza? ");
        int slicesPerPizza = intInput();

        checkEvenSlices(slicesPerPizza);

        int totalSlices = getTotalSlices(slicesPerPizza, totalPizzas);

        System.out.printf("%d people with %d pizzas (%d pieces)%n", totalPeople, totalPizzas, totalSlices);
        System.out.printf("Each person gets %d pieces of pizza.%n", getTotalPerPerson(totalSlices, totalPeople));
        System.out.printf("There are %d leftover pieces.%n", getRemainder(totalSlices, totalPeople));
    }

    public static int intInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void checkEvenSlices(int slicesPerPizza){
        while ((slicesPerPizza & 1) == 1){
            System.out.print("Please enter an even number of slices per pizza: ");
            slicesPerPizza = intInput();
        }
    }

    public static int getTotalSlices(int slices, int pizza){
        return slices * pizza;
    }

    public static int getTotalPerPerson(int slices, int people){
        return slices / people;
    }

    public static int getRemainder(int slices, int people){
        return slices % people;
    }
}
