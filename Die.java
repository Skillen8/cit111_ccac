/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sammiemakesmesimp;


import java.util.Random;

/**
 *
 * @author Shane
 */
public class Die {
   
    final static int UPPER_BOUND_VALUE = 5;
    
    static int rolledDice = 0;
    
    public static void roll(){

        Random roll = new Random();

        rolledDice = roll.nextInt(UPPER_BOUND_VALUE) + 1; 
    
    }//close method
    
    public int getValue(){
        
        return rolledDice;
        
    }//close method
 
}//close class
