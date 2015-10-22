/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;
import java.util.Random;

/**
 *
 * @author Trent Buckner
 */
public class FinalPuzzleControl {
    
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int correct;
    
    public int calcFinalPuzzle(double answerRiddle) {
       
       if (answerRiddle < 0 || answerRiddle > 10) {
       return -1;
    } 
        
       Random randa = new Random(); 
       a = randa.nextInt(10) + 1;
       Random randb = new Random(); 
       b = randb.nextInt(10) + 1;
       Random randc = new Random(); 
       c = randc.nextInt(10) + 1; 
       Random randd = new Random(); 
       d = randd.nextInt(10) + 1; 
       Random rande = new Random(); 
       e = rande.nextInt(10) + 1;
       Random randf = new Random(); 
       f = randf.nextInt(10) + 1; 
       Random randg = new Random(); 
       g = randg.nextInt(10) + 1;

       
       correct = (a + b + c + d + e + g + f) / 7;
       
       
       if (answerRiddle == correct){
           return 1;
       }
       else{
           return 0;
       }

}
}
