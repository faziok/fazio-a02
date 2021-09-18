package exercise23;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution23 {
    Scanner input = new Scanner(System.in);

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

        String answer = fix.scanAnswer("Is the car silent when you turn the key? ");

        if (answer.equals("Yes")){
            fix.batteryTerminal();
        }
        else{
            fix.slickingNoise();
        }
    }

    public String scanAnswer(String prompt){
        System.out.print(prompt);
        String answer =input.nextLine();
        answer = yesOrNo(answer);

        return answer;
    }

    public void printResponse(String prompt){
        System.out.println(prompt);
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
                printResponse("Please answer yes or no: ");
                answer = input.nextLine();
            }
        } while (!answer.equals("Yes") && !answer.equals("No"));

        return answer;
    }

    public void batteryTerminal (){
        String answer = scanAnswer("Are the battery terminals corroded? ");

        if(answer.equals("Yes")){
            printResponse("Clean terminals and try starting again.");
        }
        else{
            printResponse("Replace cables and try again.");
        }
    }

    public void slickingNoise (){
        String answer = scanAnswer("Does the car make a slicking noise? ");

        if(answer.equals("Yes")){
            printResponse("Replace the battery.");
        }
        else{
            crankUpFail();
        }
    }

    public void crankUpFail (){
        String answer = scanAnswer("Does the car crank up but fail to start? ");

        if(answer.equals("Yes")){
            printResponse("Check spark plug connections.");
        }
        else{
            engineStartDie();
        }
    }

    public void engineStartDie (){
        String answer = scanAnswer("Does the engine start and then die? ");

        if(answer.equals("Yes")){
            fuelInjection();
        }
        else{
            printResponse("This should not be possible.");
        }
    }

    public void fuelInjection (){
        String answer = scanAnswer("Does you car have fuel injection? ");

        if(answer.equals("Yes")){
            printResponse("Get it in for service.");
        }
        else{
            printResponse("Check to ensure the choke is opening and closing.");
        }
    }
}
