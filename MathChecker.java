/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;
/**
 *
 * @author Shane
 */
public class MathChecker {
    public static void main(String [] args){
        //Create final ints
        final int MAX_ATTEMPT = 3;
        final int CORRECT_ANSWER = 5;
        
        //stores user input
        int userAnswer;
        int attemptCount = 0;
        
        System.out.println("***Math Checker***");
        
        //create scanner
        Scanner userInputScanner = new Scanner(System.in);
         
        while(attemptCount < MAX_ATTEMPT){
            //ask user
            System.out.println("Computer the value of (10 * 3) / 5");
            //get user input
            userAnswer = userInputScanner.nextInt();
            
            if(userAnswer == CORRECT_ANSWER){
                System.out.println("Correct!");
                break;
            }else if(userAnswer > CORRECT_ANSWER){
                System.out.println("Sorry incorrect");
                System.out.println("Answer is too high");
                attemptCount = attemptCount + 1;
                System.out.println("Attempts: " + attemptCount + " out of " + MAX_ATTEMPT);
                System.out.println("*********");
            }else if(userAnswer < CORRECT_ANSWER){
                System.out.println("Sorry incorrect");
                System.out.println("Answer is too low");
                attemptCount = attemptCount + 1;
                System.out.println("Attempts: " + attemptCount + " out of " + MAX_ATTEMPT);
                System.out.println("*********");
            }//close if/else
            
         
        }//close while
        System.out.println("Solution is: (10 * 3) = 30, 30 / 6 = 5 ");
        System.out.println("Thank you for using math checker");
       
    }//close main
    
}//close class
