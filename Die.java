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
   
    final static int DICE_VALUE = 5;
    
    static int rolledDice = 0;
    
    public static void main(String[] args){
        
        roll(); 
        
        
    }//close main
    
    
    public static void roll(){
        
        Random roll = new Random();
        
        //for(int i = 0; i < 20; i++){
            rolledDice = roll.nextInt(DICE_VALUE);
            rolledDice += 1;
        //}//close for loop
        
        
        
    }//close method
    
    public int getValue(){
        
        return rolledDice;
        
    }//close method
    
    
    
    
}//close classs
