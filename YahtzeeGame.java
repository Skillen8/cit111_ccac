/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sammiemakesmesimp;

/**
 *
 * @author Shane
 */
public class YahtzeeGame {
    
    public static void main(String[] args){
        
        die d = new die();
        
        for(int i = 0; i < 10; i++){
            
            d.roll();
            System.out.println("roll(): " + d.getValue());
 
        }//close for loop
        
        System.out.println("getValue(): " + d.getValue());
        
    }//close main
    
    
    
    
}
