/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sammiemakesmesimp;

import java.util.Scanner;


/**
 *
 * @author Shane
 */
public class YahtzeeGame {
            
    public static void main(String[] args){
        Yahtzee yahtzee = new Yahtzee();
        System.out.println(yahtzee.getScoreCard());
        Scanner askUser = new Scanner(System.in);
        int askTwice = 0;
        
        
        while(askTwice < 2){
            
            System.out.println("Enter die number(s) to keep (separated by a space):");
            String userKeep = askUser.nextLine();
            
            if(userKeep.contains("1") == false){
            yahtzee.rollADie(0);
            }//close if
            if(userKeep.contains("2") == false){
            yahtzee.rollADie(1);
            }//close if
            if(userKeep.contains("3") == false){
            yahtzee.rollADie(2);
            }//close if
            if(userKeep.contains("4") == false){
            yahtzee.rollADie(3);
            }//close if
            if(userKeep.contains("5") == false){
            yahtzee.rollADie(4);
            }//close if
            
            askTwice += 1;
            System.out.println(yahtzee.getScoreCard());
        
        }//close while   
    }//close main
    
}//close class

