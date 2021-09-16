package exercise23;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution23 {

    /*
     * Pseudocode:
     *
     * prompt user "Is the car silent when you turn the key?"
     * scan in to answer/check if answer is yes, no, y, or, n. All ignoring case.
     *
     * if answer == 'y' or 'yes'
     *     (( prompt user: "Are the battery terminals corroded?"
     *      string answer = input
     *
     *      if answer == 'y' or 'yes'
     *          message "Clean terminals and try starting again."
     *      else
     *          message "Replace cables and try again."))
     *
     * else
     *      (( prompt user "Does the car make a slicking noise?"
     *      answer = input
     *
     *      if answer == 'y' or 'yes'
     *          message "Replace the battery."
     *          exit
     *      else )) METHOD
     *
     *
     *          ((Prompt user "Does the car crank up but fail to start?"
     *          answer = input
     *
     *          if answer == 'y' or 'yes'
     *              message "Check spark plug connections."
     *              exit
     *          else)) METHOD
     *
     *
     *              ((Prompt user "Does the engine start and then die?"
     *              answer = input
     *
     *              if answer == 'y' or 'yes'
     *                  ((Prompt user "Does you car have fuel injection?"
     *                  answer = input
     *
     *                  if answer == 'y' or 'yes'
     *                      message = "Get it in for service."
     *                      exit
     *                  else
     *                      message = "Check to ensure the choke is opening and closing.")) METHOD
     *              else
     *                  message = "This should not be possible."))
     *
     */

    public static void main(String[] args) {
        Solution23 fix = new Solution23();

        System.out.print("Is the car silent when you turn the key? ");
        String answer = fix.scanAnswer();

        if (answer.equals("Yes")){
            fix.batteryTerminal();
        }
        else{
            fix.slickingNoise();
        }
    }

    public String scanAnswer(){
        Scanner input = new Scanner(System.in);
        String answer =input.nextLine();

        answer = yesOrNo(answer);

        return answer;
    }

    public String yesOrNo(String answer){
        do{
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
                answer = "Yes";
            }
            else if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")){
                answer = "No";
            }
            else{
                System.out.print("Please answer yes or no: ");
                Scanner input = new Scanner(System.in);
                answer = input.nextLine();
            }
        } while (!answer.equals("Yes") && !answer.equals("No"));

        return answer;
    }

    public void batteryTerminal (){
        System.out.print("Are the battery terminals corroded? ");
        String answer = scanAnswer();

        if(answer.equals("Yes")){
            System.out.println("Clean terminals and try starting again.");
        }
        else{
            System.out.println("Replace cables and try again.");
        }
    }

    public void slickingNoise (){
        System.out.print("Does the car make a slicking noise? ");
        String answer = scanAnswer();

        if(answer.equals("Yes")){
            System.out.println("Replace the battery.");
        }
        else{
            crankUpFail();
        }
    }

    public void crankUpFail (){
        System.out.print("Does the car crank up but fail to start? ");
        String answer = scanAnswer();

        if(answer.equals("Yes")){
            System.out.println("Check spark plug connections.");
        }
        else{
            engineStartDie();
        }
    }

    public void engineStartDie (){
        System.out.print("Does the engine start and then die? ");
        String answer = scanAnswer();

        if(answer.equals("Yes")){
            fuelInjection();
        }
        else{
            System.out.println("This should not be possible.");
        }
    }

    public void fuelInjection (){
        System.out.print("Does you car have fuel injection? ");
        String answer = scanAnswer();

        if(answer.equals("Yes")){
            System.out.println("Get it in for service.");
        }
        else{
            System.out.println("Check to ensure the choke is opening and closing.");
        }
    }
}
