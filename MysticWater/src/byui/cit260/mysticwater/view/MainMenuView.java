/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.GameControl;
import static byui.cit260.mysticwater.view.GameMenuView.gameMenu;
import static byui.cit260.mysticwater.view.HelpMenuView.helpMenu;
import java.util.Scanner;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n-----------------------------------"
            + "\n|Main Menu                        |"
            + "\n-----------------------------------"
            + "\nS - Start Game"
            + "\nL - Load Game"
            + "\nH - Help Menu"
            + "\nQ - Quit"
            + "\n-----------------------------------";

    public void displayMainMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);
            
            String input = this.mainMenuRequest();
            selection = input.charAt(0);
            
            this.doMenuSelection(selection);
            
        } while (selection != 'Q');
    }

    private String mainMenuRequest() {
       boolean valid = false;
       String menuRequest = null;
       Scanner keyboard = new Scanner(System.in);
       
       while (!valid) {
          
           System.out.println("Select an option by entering the corresponding letter:");
           
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

    private void doMenuSelection(char selection) {
        
        switch (selection) {
            case 'S':
                this.startNewGame();
                break;
            case 'L':
                this.loadGame();
                break;
            case 'H':
                this.helpMenu();
                break;
            case 'Q':
                this.quitGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                       
        }

    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(MysticWater.getPlayer());
        
        //display game menu
        GameMenuView.gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void loadGame() {
        System.out.println("loadGame function was called");
    }

    private void helpMenu() {
        //display help menu
        HelpMenuView.helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void quitGame() {
        System.out.println("quitGame function was called");
    }
    
}
