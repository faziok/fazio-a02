package exercise08;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution08 {

    /*
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
     */



    public static void main(String[] args) {
        Solution08 pizza = new Solution08();

        System.out.print("How many people? ");
        int totalPeople = pizza.intInput();

        System.out.print("How many pizzas do you have? ");
        int totalPizzas = pizza.intInput();

        System.out.print("How many slices per pizza? ");
        int slicesPerPizza = pizza.intInput();

        slicesPerPizza = pizza.checkEvenSlices(slicesPerPizza);

        int totalSlices = pizza.getTotalSlices(slicesPerPizza, totalPizzas);

        System.out.printf("%d people with %d pizzas (%d pieces)%n", totalPeople, totalPizzas, totalSlices);
        System.out.printf("Each person gets %d pieces of pizza.%n", pizza.getTotalPerPerson(totalSlices, totalPeople));
        System.out.printf("There are %d leftover pieces.%n", pizza.getRemainder(totalSlices, totalPeople));
    }

    public int intInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public int checkEvenSlices(int slicesPerPizza){
        while ((slicesPerPizza & 1) == 1){
            System.out.print("Please enter an even number of slices per pizza: ");
            slicesPerPizza = intInput();
        }
        return slicesPerPizza;
    }

    public int getTotalSlices(int slices, int pizza){
        return slices * pizza;
    }

    public int getTotalPerPerson(int slices, int people){
        return slices / people;
    }

    public int getRemainder(int slices, int people){
        return slices % people;
    }
}
