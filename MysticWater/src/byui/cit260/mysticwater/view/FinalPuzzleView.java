/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.FinalPuzzleControl;
import byui.cit260.mysticwater.exceptions.FinalPuzzleException;
import java.util.Scanner;

/**
 *
 * @author Trent Buckner
 */
public class FinalPuzzleView extends View {
    public static FinalPuzzleView finalPuzzle;
    
    private int[] randomValues;

    public FinalPuzzleView() {
        super("Solve the equation. Round your answer down to the nearest integer. Please input your answer:");
    }

    @Override
    public void displayView() {
        int answer = 0;
        
        randomValues = FinalPuzzleControl.getRandomValues();
        do {
            System.out.println(randomValues[0] + " + " + randomValues[1] + " + " + randomValues[2] + " + " + randomValues[3] + " + " + randomValues[4] + " + "
             + randomValues[5] + " + "  + randomValues[6] + " / 7 = ? ");
            
            String input = this.getInput();
        try {
            answer = Integer.parseInt(input);
        }
        catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number or you die.");
        }
            this.doAction(answer);
        } 
        while (answer != ' ');
    }
    
    @Override
    public String getInput() {
       boolean valid = false;
       String menuRequest = null;
       Scanner keyboard = new Scanner(System.in);
       
       while (!valid) {
           
           menuRequest = keyboard.nextLine();
           menuRequest = menuRequest.trim();
           
           if (menuRequest.length() == 0) {
               System.out.println("Invalid input - the value must not be blank");
               continue;
           }
           break;
       }
       return menuRequest;
    }
    
    @Override
    public boolean doAction(Object answer) {
   
        int result = 0;
        try {
            result = FinalPuzzleControl.calcFinalPuzzle((Integer) answer, randomValues);
        } catch (FinalPuzzleException ex) {
            System.out.println(ex.getMessage());
        }
        
        if (result == 1){
            System.out.println("Correct!");
            return true;
        }
        else{
            System.out.println("Incorrect. Please try again.");
        }
        return false;
    }
}
