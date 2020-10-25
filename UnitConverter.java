/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;


/**
 *
 * @author Shane
 */
public class UnitConverter {
    
    public static void main(String[] args){
        
        //scanner object
        Scanner userInput = new Scanner(System.in);
        
        //question 1  feet per second
        System.out.println("Enter a speed in miles per hour");
        //gets users input
        double usersMPH = userInput.nextDouble();
        //does conversion then stores it
        double returnedFPS = MPHToFPS(usersMPH);
        System.out.println(usersMPH + " in feet per second is: " + returnedFPS);
        
        //question 2 seconds of the day
        System.out.println("Enter the time of the day to closest hour in military time");
        //gets users input
        int userTime = userInput.nextInt();
        //does conversion then stores it
        int returnedTime = timeOfDayInSeconds(userTime);
        System.out.println("It has been " + returnedTime + " seconds today.");
        

        //Question 3 currency conversion
        System.out.println("Enter the amount of USD you would like to convert to Yen.");
        //gets users input
        double userDollar = userInput.nextDouble();
        //does conversion then stores it
        double returnedDollar = currencyConversion(userDollar);
        System.out.println("If you have $" + userDollar + " that equals " + returnedDollar + " Yen.");
        
        
    }//close main
    
    public static double MPHToFPS(double mph){
        // 1 mph is equal to 1.47 fps
        final double CONVERSION = 1.4666667;
        double fps = mph * CONVERSION;
        //if not letting user select a negative speed
        if(0 > mph){
            System.out.println("That is not a correct speed");
            return 0;
        } // close if
        
        return fps;
        
    }//close method MPHToFPS
    
    public static int timeOfDayInSeconds (int hour){
        
        final int SECOND_CONVERSION = 3600;
        int days = hour * SECOND_CONVERSION ;
        
        if(0 > hour || hour > 24){
            System.out.println("That isn't a correct time");
            return 0; 
        } //close if
        
        return days;
        
        }// close method timeOfDaysInSeconds
        
    
    public static double currencyConversion(double USD){
        
        // 1 USD is equal to 105.44 yen        
        double yen = 105.44;
        double dollarToYen = USD * yen;
        
        if(USD < 0){
            System.out.println("That isn't a correct number, unless you are in debt");
            return 0;
        }//close if
        
        return dollarToYen;
  
    }//close method
       
        
        
    } //close class
  


    
   
    

