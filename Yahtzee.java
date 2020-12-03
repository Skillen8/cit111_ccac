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
public class Yahtzee {
    
    static final int MAX_DICE = 5;
    private Die[] dice;
    private int[] counts;
    
    public Yahtzee(){
        
        dice = new Die[5];
        
        for (int i = 0; i < MAX_DICE; i++){
            
            dice[i] = new Die();
           
        }//close for loop
       
        counts = new int[6];
        
       rollAllDice();
   
    }//close method

    public void rollADie(int dieNumber){
        
        dice[dieNumber].roll();
        updateCounts();
    }//close method
    
    public void rollAllDice(){
    
        for(int i = 0; i < MAX_DICE; i++){
           // System.out.println(dice[i]);            
             rollADie(i);
        }//close for loop
     updateCounts();
    }//close method
    
    public int getADie(int dieNumber){
        
        return dice[dieNumber].getValue();
        
    }//close method
    
    public  String showDice(){
        
       String show ="+------+---+---+---+---+---+\n";
       show += "| Dice |";
       for(int i = 1; i <= MAX_DICE; i++){
           show += " "+(i)+" |";
       }
       show += "\n+------+---+---+---+---+---+\n";
       show += "| Face |";
       for(int i = 0;i < MAX_DICE; i++){
           show += " " + dice[i].getValue()+ " |";
       }
       show += "\n+------+---+---+---+---+---+\n";
       return show;

    }//close method
    

    private int countUp(int value){
        int n = 0;
        for(int i = 0; i < 5; i++){
            if (dice[i].getValue() == value){
                n++;
            }//close if
    }//for
        return n;
    }//closes method
    
    private void updateCounts(){
        for(int i = 0; i < 6; i++){
            counts[i] = countUp(i + 1);
            //System.out.println("Number of " + (i + 1) + "s rolled: " + counts[i]);
        }//closes for loop
    }//closes method
    
    public int getScoreOnes(){
        int ones = 0;
        ones = counts[0] * 1;
        return ones;
    }//closes method
    
    public int getScoreTwos(){
        int twos = 0;
        twos = counts[1] * 2;
        return twos;
    }//closes method
    
    public int getScoreThrees(){
        int threes = 0;
        threes = counts[2] * 3;
        return threes;
    }//closes method
    
    public int getScoreFours(){
        int fours = 0;
        fours = counts[3] * 4;
        return fours;
    }//closes method
    
    public int getScoreFives(){
        int fives = 0;
        fives = counts[4] * 5;
        return fives;
    }//closes method
    
    public int getScoreSixes(){
        int sixes = 0;
        sixes = counts[5] * 6;
        return sixes;
    }//closes method
    
    public int getScoreThreeOfAKind(){
        for(int i = 0; i < 6; i++){
            if(counts[i] >= 3){
                int total = dice[0].getValue() + dice[1].getValue() + dice[2].getValue() + dice[3].getValue() + dice[4].getValue();
                return total; 
            }//closes if
        }//closes for loop
        return 0;
    }//closes method
    
    public int getScoreFourOfAKind(){
        for(int i = 0; i < 6; i++){
            if(counts[i] >= 4){
                int total = dice[0].getValue() + dice[1].getValue() + dice[2].getValue() + dice[3].getValue() + dice[4].getValue();
                return total;
            }//closes if
        }//closes for loop
        return 0;
    }//closes method
    
    public int getScoreFullHouse(){
        boolean fullHouse = false;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                if((counts[i] == 3) && (counts[j] == 2)){
                    fullHouse = true;
                    return 25;
                }//close if
            }//closes for loop j
        }//closes for loop i
        return 0;
    }//closes method
    
    public int getScoreSmallStraight(){
    
        for(int i = 0; i < 3; i++){
            if((counts[i] >= 1) && (counts[i+1] >= 1) && ( counts[i+2] >= 1) && (counts[i+3] >= 1)){
                return 30;   
            }//close if
        }//closes for
        return 0;
    }//close method
    public int getScoreLargeStraight(){
        for(int i = 0; i < 2; i++){
            if((counts[i] >= 1) && (counts[i+1] >= 1) && ( counts[i+2] >= 1) && (counts[i+3] >= 1) && (counts[i+4] >= 1)){
                return 40;   
            }//close if
        }//closes for
            return 0;
    }//closes method
    
    public int getScoreChance(){
        return dice[0].getValue() + dice[1].getValue() + dice[2].getValue() + dice[3].getValue() + dice[4].getValue();
    }//closes method
    
    public int getScoreYahtzee(){
        for(int i = 1; i < 6; i++){
            if(counts[i] == 5){
                return 50;
            }//closes else
        }//closes for loop
        return 0;
    }//closes method
    
    public String getScoreCard(){
        String display=showDice();
        display+= "\n \n \tOnes: "+getScoreOnes()+"\n\tTwos: "+getScoreTwos()+ "\n\tThrees: "+getScoreThrees();
 
        display+= "\n\tFours: "+getScoreFours()+"\n\tFives: "+getScoreFives()+"\n\tSixes: "+getScoreSixes();
 
        display+="\n\n";
        display+="\nThree of a Kind: "+getScoreThreeOfAKind()+"\nFour of a Kind: "+ getScoreFourOfAKind()+"\nFull House: "+getScoreFullHouse() + "\nSmall Straight: "+getScoreSmallStraight() ;
        display +="\nLarge Straight: "+ getScoreLargeStraight()+"\nChance: "+getScoreChance()+"\nYahtzee: "+ getScoreYahtzee();
 
        return display;
    
    }//closes method

}//close class