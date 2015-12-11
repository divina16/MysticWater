/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.FinalPuzzleControl;
import byui.cit260.mysticwater.exceptions.FinalPuzzleException;
import static byui.cit260.mysticwater.view.GameMenuView.gameMenu;
import static byui.cit260.mysticwater.view.MainMenuView.mainMenu;
import static byui.cit260.mysticwater.view.MoveCharacterView.move;

/**
 *
 * @author Trent Buckner
 */
public class FinalPuzzleView extends View {
    public static FinalPuzzleView finalPuzzle;
    
    private int[] randomValues;

    public FinalPuzzleView() {
        super("");
        randomValues = FinalPuzzleControl.getRandomValues();
            this.setPromptMessage("Solve the equation. Round your answer down to the nearest integer. Please input your answer:"
                + "\n\n" + randomValues[0] + " + " + randomValues[1] + " + " + randomValues[2] + " + " + randomValues[3] + " + " + randomValues[4] + " + " + randomValues[5] + " + "  + randomValues[6] + " / 7 = ?");
    }
    
    @Override
    public boolean doAction(Object obj) {
   
        int result = 0;
        try {
            int answer = Integer.parseInt((String) obj);
            result = FinalPuzzleControl.calcFinalPuzzle((Integer) answer, randomValues);
        } catch (FinalPuzzleException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        
        if (result == 1){
            this.console.println("Correct!");
            this.console.println("\n---------------------------------\n"
                               + "         CONGRATULATIONS!           "
                               + "\n-- ------------------------------"
                               + "\n\nYou have successfully scaled the mountains and retrieved the mystic water!"
                                    + "\nThe old man can now return to his wife and save her!"
                                    + "\n\nYou will now be returned to the start menu."
                                    + "\nCome back and play again!");
            return true;
        }
        else {
            this.console.println("Incorrect. Please try again. You must solve the puzzle before you can move to a new location.");
            return false;
        }
    }
    
    public static FinalPuzzleView getInstance() {
        
        if (finalPuzzle == null) {
            finalPuzzle = new FinalPuzzleView();
        }
        return finalPuzzle;
    }
}
