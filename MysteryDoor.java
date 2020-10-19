/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;

import java.util.Random;

/**
 *
 * @author Shane
 */
public class MysteryDoor {
    public static void main(String[] args){
        
        int doorNum;
        
        System.out.println("Welcome to the Mystery Door");
        System.out.println("Choose a door to open, enter 1-2-3");
        
        Scanner doorChoice = new Scanner(System.in);
        
        doorNum = doorChoice.nextInt();
        
        switch(doorNum){
            case 1:
                doorOne();
                break;
            case 2:
                doorTwo();
                break;
            case 3:
                doorThree();
                break;
        }//close switch
        
        
    }//close main
    
    public static void doorOne(){
        
        int userNum;
        
        System.out.println("You have opend door one");
        System.out.println("What number would you like to multipy by 10?");
        Scanner mult = new Scanner(System.in);
        
        userNum = mult.nextInt();
        
        int cashWin = (userNum * 10);
        
        System.out.println("You won $" + cashWin);
        
        
    }//close door one
    
    public static void doorTwo(){
        
         
        
        System.out.println("You have opend door two");
        System.out.println("Generating random number");
        
  
        
        Random randomNum = new Random();
        
        int winnings = randomNum.nextInt();

        System.out.println("You have won $" + winnings);
        
        
        
    }//close doorTwo
    
    public static void doorThree(){
        System.out.println("You selectd Door Three");
        System.out.println("Sorry, now you have to wait for the computer to count to 100000");
        
        for(int numLoops = 0; numLoops < 100001; numLoops = numLoops + 1){
            System.out.println("Counter: " + numLoops);
        }//close for loop
        
        
    }//close doorThree
    
}//close class
