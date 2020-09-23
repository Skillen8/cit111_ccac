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
public class MightWeBeFriends {
    public static void main(String[] args){
        //storage for friend score
        int friendScore = 0;
        int music;
        int doors;
        int chickenWings;
        String flavor;
        
        Scanner userInputScanner = new Scanner(System.in);

        //ask user
        System.out.println("Do you like music? (yes = 1) (no = 0)");
        //user input
        music = userInputScanner.nextInt();
        
        //logic block for being friends
        if(music == 1){
            friendScore = friendScore + 10;
            System.out.println("Do you like The Doors? (yes = 1) (no = 0) ");
            System.out.println("Compatibilty score is now " + friendScore);
        }else{
            System.out.println("That is lame");
            System.out.println("So I assume you don't like The Doors? (yes = 1) (no = 0)");

        }//close if else
        
        //user input
        doors = userInputScanner.nextInt();
        // logic block for being friends
        if(doors == 1){
            friendScore = friendScore + 10;
            System.out.println("Compatibility score is now " + friendScore);
            System.out.println("Cool, Do you like chicken wings? (yes = 1) (no = 0)");
        }else{
            System.out.println("That is lame");
            System.out.println("Compatibilty score is now " + friendScore);
            System.out.println("Do you like chicken wings? (yes = 1) (no = 0)");

        }//close if else
        
        //user input
        chickenWings = userInputScanner.nextInt();
        //logic block for being friends
        if(chickenWings == 1){
            friendScore = friendScore + 10;
            System.out.println("Compatibilty score is now " + friendScore);
            System.out.println("Cool, what iss you favoirte flavor?");
            flavor = userInputScanner.next();
            System.out.println(flavor + ": Nice, mine is pookie from Big Shot Bobs");
        }else{
            System.out.println("That is lame");
            System.out.println("Compatibilty score is now " + friendScore);

        }//close if else
        
        //logic block to check if we can be friends
        if(friendScore >= 20){
            System.out.println("Determing if we can be friends");
            System.out.println("Compatibilty Score is now " + friendScore);
            System.out.println("*******************************");
            System.out.println();
            System.out.println("We might be friends");
        }else{
            System.out.println("Sorry, we can't be friends");
        }//close if else
                
        
        
    }//close main method
}//close class MightBeFriends
