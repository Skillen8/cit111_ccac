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
public class Yahtzee {
    
    static final int MAX_DICE = 5;
    private Die[] dice;
    
    public  void Yahtzee(){
        
        dice = new Die[5];
        
        for (int i = 0; i < 5; i++){
            
            dice[i] = new Die();
           // System.out.println(dice[i]);
        }//close for loop
        
        rollAllDice();
        
        
        
    }//close method
    
    public  void rollADie(int dieNumber){
        
        //dieNumber += dieNumber;  
        dice[dieNumber].roll();

         
        
    }//close method
    
    public  void rollAllDice(){
    
        
                
        
        for(int i = 0; i < 5; i++){
           // System.out.println(dice[i]);            
             dice[i].roll();
        }//close for loop
    
        
    }//close method
    
    public  int getADie(int dieNumber){
        
        return dice[dieNumber].getValue();
        
    }//close method
    
    public  String showDice(){
        
       String show ="+------+---+---+---+---+---+\n";
       show += "| Dice |";
       for(int i = 1; i <= 5; i++){
           show += " "+(i)+" |";
       }
       show += "\n+------+---+---+---+---+---+\n";
       show += "| Face |";
       for(int i = 0;i < 5; i++){
           show += " " + dice[i].getValue()+ " |";
       }
       show += "\n+------+---+---+---+---+---+\n";
       return show;

    }//close method
    
    

























}//close class

