/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.PuzzleControl;
import byui.cit260.mysticwater.exceptions.PuzzleException;
import static byui.cit260.mysticwater.view.GameMenuView.gameMenu;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class PuzzleView extends View {

    public static PuzzleView nPuzzle;

    private int[] randomValues;

    public PuzzleView() {
        super("");
        randomValues = PuzzleControl.getRandomValues();
        this.setPromptMessage("\nSolve the equation. Round your answer down to the nearest integer. Please input your answer:" + "\n\n" + randomValues[0] + " + " + randomValues[1] + " + " + randomValues[2] + " + " + randomValues[3] + " + " + randomValues[4]
                + " / 7 = ?");
    }

    @Override
    public boolean doAction(Object obj) {

        int result = 0;
        try {
            int answer = Integer.parseInt((String) obj);
            result = PuzzleControl.calcPuzzle((Integer) answer, randomValues);
        } catch (PuzzleException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }

        if (result == 1) {
            int currentMoney = MysticWater.getCurrentGame().getPlayer().getMoney();
            currentMoney += 100;
            MysticWater.getCurrentGame().getPlayer().setMoney(currentMoney);
            this.console.println("Correct! You can now move to a new location!"
                    + "\nYou have also gained 100 money!");
            return true;
        } else {
            this.console.println("Incorrect. Please try again. You must solve the puzzle before you can move to a new location.");
            return false;
        }

    }

    public static PuzzleView getInstance() {

        if (nPuzzle == null) {
            nPuzzle = new PuzzleView();
        }
        return nPuzzle;
    }
}
