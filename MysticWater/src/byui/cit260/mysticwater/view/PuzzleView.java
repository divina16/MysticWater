/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.PuzzleControl;
import byui.cit260.mysticwater.exceptions.PuzzleException;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class PuzzleView extends View{
    public static PuzzleView nPuzzle;
    
    private int[] randomValues;

    public PuzzleView() {
        super("");
    }

@Override
    public void displayView() {
        int answer = 0;
        
        randomValues = PuzzleControl.getRandomValues();
        do {
            this.console.println("Solve the equation. Round your answer down to the nearest integer. Please input your answer:"
                    + "\n\n" + randomValues[0] + " + " + randomValues[1] + " + " + randomValues[2] + " + " + randomValues[3] + " + " + randomValues[4] + " + "
              + "/ 7 = ? ");
            
            String input = this.getInput();
        try {
            answer = Integer.parseInt(input);
        }
        catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number or you die.");
        }
            this.doAction(answer);
        } 
        while (answer != ' ');
    }
    
    @Override
    public String getInput() {
       boolean valid = false;
       String menuRequest = null;
       
    try {
       while (!valid) {
           
           menuRequest = keyboard.readLine();
           menuRequest = menuRequest.trim();
           
           if (menuRequest.length() == 0) {
               ErrorView.display(this.getClass().getName(), "Invalid input - the value must not be blank");
               continue;
           }
           break;
       }
    } catch (Exception e) {
        ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
    }
       return menuRequest;
    }
    
    @Override
    public boolean doAction(Object answer) {
   
        int result = 0;
        try {
            result = PuzzleControl.calcPuzzle((Integer) answer, randomValues);
        } catch (PuzzleException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        
        if (result == 1){
            this.console.println("Correct!");
            GameMenuView.gameMenu.displayView();
            return true;
        }
        else{
            this.console.println("Incorrect. Please try again.");
            GameMenuView.gameMenu.displayView();
        }
        return false;
    }
}
