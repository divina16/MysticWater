/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.GameControl;
import static byui.cit260.mysticwater.view.GameMenuView.gameMenu;
import static byui.cit260.mysticwater.view.HelpMenuView.helpMenu;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
    
        super("\n"
            + "\n-----------------------------------"
            + "\n|Main Menu                        |"
            + "\n-----------------------------------"
            + "\nS - Start Game"
            + "\nL - Load Game"
            + "\nH - Help Menu"
            + "\nE - Exit"
            + "\n-----------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        
        switch (selection) {
            case "S":
                this.startNewGame();
                break;
            case "L":
                this.loadGame();
                break;
            case "H":
                this.helpMenu();
                break;
            case "E":
                this.exit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                return false;
                       
        }
        return true;
    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(MysticWater.getPlayer());
        
        //display game menu
        GameMenuView.gameMenu = new GameMenuView();
        gameMenu.displayView();
        displayView();
    }

    private void loadGame() {
        GameControl.loadGame();
        displayView();
    }

    private void helpMenu() {
        //display help menu
        HelpMenuView.helpMenu = new HelpMenuView();
        helpMenu.displayView();
        displayView();
    }

    private void exit() {
        GameControl.quitGame();
    }
    
}
