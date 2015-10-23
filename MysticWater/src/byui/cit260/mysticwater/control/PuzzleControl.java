/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;
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
    
public int calcPuzzle (int answerRiddle) {
    if (answerRiddle<0 || answerRiddle>10){
        return -1;
    }
    Random randa = new Random();
    a=randa.nextInt(10)+1;
    Random randb = new Random();
    b=randa.nextInt(10)+1;
    Random randc = new Random();
    c=randa.nextInt(10)+1;
    Random randd = new Random();
    d=randa.nextInt(10)+1;
    Random rande = new Random();
    e=randa.nextInt(10)+1;
    
   answer = a + b - c * d / e;
   
   if (answerRiddle == answer) {
       return 1;
   }
   
   else{ 
       return 0;
   }
   
   }        
}
