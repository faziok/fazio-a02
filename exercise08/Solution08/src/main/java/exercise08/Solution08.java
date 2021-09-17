package exercise08;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution08 {
    Scanner input = new Scanner(System.in);

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

        int totalPeople = Integer.parseInt(pizza.scanInput("How many people? "));
        int totalPizzas = Integer.parseInt(pizza.scanInput("How many people? "));
        int slicesPerPizza = Integer.parseInt(pizza.scanInput("How many slices per pizza? "));

        int numSlicesPerPizza = pizza.checkEvenSlices(slicesPerPizza);
        int totalSlices = pizza.getTotalSlices(numSlicesPerPizza, totalPizzas);

        System.out.printf("%d people with %d pizzas (%d pieces)%n", totalPeople, totalPizzas, totalSlices);
        System.out.printf("Each person gets %d pieces of pizza.%n", pizza.getTotalPerPerson(totalSlices, totalPeople));
        System.out.printf("There are %d leftover pieces.%n", pizza.getRemainder(totalSlices, totalPeople));
    }

    public String scanInput(String prompt){
        System.out.print(prompt);
        return isNumeric();
    }

    public String isNumeric(){
        boolean numeric = input.hasNextDouble();
        String answer = input.nextLine();

        while (!numeric){
            System.out.print("Please answer with a positive numeric values only: ");
            numeric = input.hasNextDouble();
            answer = input.nextLine();
        }
        return answer;
    }

    public int checkEvenSlices(int slicesPerPizza){
        while ((slicesPerPizza & 1) == 1){
            slicesPerPizza = Integer.parseInt(scanInput("Please enter an even number of slices per pizza: "));
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
