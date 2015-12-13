/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.DistancePuzzleControl;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class DistancePuzzleView extends View {

    static DistancePuzzleView distancePuzzle;
    private int[] randomValues;

    DistancePuzzleView() {
        super("");
        randomValues = DistancePuzzleControl.getRandomValues();
        this.setPromptMessage("How far would you need to travel to get from " + randomValues[0] + " ," + randomValues[1] + " to " + randomValues[2] + " ," + randomValues[3] + ".");
    }

    @Override
    public void displayView() {
        String selection;
        String[] inputs = new String[4];
        boolean done = false;

        do {
            this.console.println(getPromptMessage());
            this.console.println("Enter a value for North:");
            inputs[0] = this.getInput();
            this.console.println("Enter a value for South:");
            inputs[1] = this.getInput();
            this.console.println("Enter a value for East:");
            inputs[2] = this.getInput();
            this.console.println("Enter a value for West:");
            inputs[3] = this.getInput();
            done = this.doAction(inputs);

        } while (!done);
    }

    @Override
    public boolean doAction(Object obj) {
        String[] inputs = (String[]) obj;
        int[] ints = new int[4];
        ints[0] = Integer.parseInt((String) inputs[0]);
        ints[1] = Integer.parseInt((String) inputs[1]);
        ints[2] = Integer.parseInt((String) inputs[2]);
        ints[3] = Integer.parseInt((String) inputs[3]);
        boolean correct = DistancePuzzleControl.calcDistancePuzzle(randomValues, ints);
        
        if (correct == true) {
            int currentMoney = MysticWater.getCurrentGame().getPlayer().getMoney();
            currentMoney += 100;
            MysticWater.getCurrentGame().getPlayer().setMoney(currentMoney);
            this.console.println("Correct! You can now move to a new location!"
                    + "\nYou have also gained 100 money!");
            return true;
        }
        else {
            this.console.println("Incorrect. Please try again. You must solve the puzzle before you can move to a new location.");
            return false;
        }       
    }
    
    public static DistancePuzzleView getInstance() {

        if (distancePuzzle == null) {
            distancePuzzle = new DistancePuzzleView();
        }
        return distancePuzzle;
    }
}
