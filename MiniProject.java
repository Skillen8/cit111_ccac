/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;
/**
 *
 * @author Shane
 */
public class MiniProject {
    public static void main(String[] args){
         //storage for scanner
        double avgMPG;
        double gasLeft;
        double distanceToStation;
        
        Scanner userInputScanner = new Scanner(System.in);
        
        //ask user
        System.out.println("What is you cars avergage MPG");
        //user input
        avgMPG = userInputScanner.nextDouble();
       
        //ask user
        System.out.println("How many gallons of gas do you have left");   
        // user input
        gasLeft = userInputScanner.nextDouble();
        
        //ask user
        System.out.println("How far are away are you from station?");
        //user input
        distanceToStation = userInputScanner.nextDouble();
        
        //calculate if car can make it
        double carsDistance = (gasLeft * avgMPG);
        double distanceFromCarToStation = distanceToStation - carsDistance;
        double leftOverGas = carsDistance - distanceToStation;
        
        //if logic to see if driver can make it
        if(carsDistance < distanceToStation){
            System.out.println("Sorry, you wont make it. You are " + distanceFromCarToStation + " miles away");
        }else{
            System.out.println("You will be able to make it with " + leftOverGas + " miles left in your car");
        }//close if block
        
        
        
        
        
    }//close main   
    
}//close class MiniProject
