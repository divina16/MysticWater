/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;
import byui.cit260.mysticwater.exceptions.PuzzleException;
import java.util.Random;
/**
 *
 * @author Nina Sanchez
 */
public class PuzzleControl {
    int a;
    int b;
    int c;
    int d;
    int e;
    int answer;
    
        
    static int correct;
    
    public static int calcPuzzle(int answerRiddle, int[] randomValues) throws PuzzleException {
       
       if (answerRiddle < 0 || answerRiddle > 10) {
            throw new PuzzleException("Answer is invalid. Cannot be less than 0 or greater than 10.");
    } 
  
       correct = (randomValues[0] + randomValues[1] + randomValues[2] + randomValues[3] + randomValues[4]) / 7;
       
       if (answerRiddle == correct){
           return 1;
       }
       else{
           return 0;
       }
}
    
public static int[] getRandomValues() {
        
        int[] randomValues = new int[5];
        
        Random randa = new Random(); 
       randomValues[0] = randa.nextInt(10) + 1;
       Random randb = new Random(); 
       randomValues[1] = randb.nextInt(10) + 1;
       Random randc = new Random(); 
       randomValues[2] = randc.nextInt(10) + 1; 
       Random randd = new Random(); 
       randomValues[3] = randd.nextInt(10) + 1; 
       Random rande = new Random(); 
       randomValues[4] = rande.nextInt(10) + 1;
       Random randf = new Random(); 
       
       return randomValues;
    }        
}
