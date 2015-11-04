/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.FinalPuzzleControl;
import java.util.Scanner;

/**
 *
 * @author Trent Buckner
 */
public class FinalPuzzleView {
    public static FinalPuzzleView finalPuzzle;

    public void displayFinalPuzzle() {
        int answer = 0;
        
        int[] randomValues = FinalPuzzleControl.getRandomValues();
        do {
            System.out.println("Solve the equation. Round your answer down to the nearest integer. Please input your answer:");
            System.out.println(randomValues[0] + " + " + randomValues[1] + " + " + randomValues[2] + " + " + randomValues[3] + " + " + randomValues[4] + " + "
             + randomValues[5] + " + "  + randomValues[6] + " / 7 = ? ");
            
            String input = this.finalPuzzleRequest();
            answer = Integer.parseInt(input);
            
            this.doFinalPuzzle(answer, randomValues);
            
        } while (answer != ' ');
    }
    
    private String finalPuzzleRequest() {
       boolean valid = false;
       String finalRequest = null;
       Scanner keyboard = new Scanner(System.in);
       
       while (!valid) {
           
           finalRequest = keyboard.nextLine();
           finalRequest = finalRequest.trim();
           
           if (finalRequest.length() == 0) {
               System.out.println("Invalid input - the value must not be blank");
               continue;
           }
           break;
       }
       return finalRequest;
    }
    
    public void doFinalPuzzle(int answer, int[] randomValues) {
   
        int result = FinalPuzzleControl.calcFinalPuzzle(answer, randomValues);
        
        if (result == 1){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Incorrect. Please try again.");
        }
        if (result == -1) {
            System.out.println("Input is invalid.");
        }
    }
    
}
