/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import static byui.cit260.mysticwater.view.FinalPuzzleView.finalPuzzle;
import byui.cit260.mysticwater.control.InventoryControl;
import static byui.cit260.mysticwater.view.InventoryView.inventory;
import java.util.Scanner;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class GameMenuView {
    static GameMenuView gameMenu;
    
    private final String GAME = "\n"
            + "\n-----------------------------------"
            + "\n|Game Menu                        |"
            + "\n-----------------------------------"
            + "\nI - View Inventory"
            + "\nM - View Map"
            + "\nC - Move Character"
            + "\nG - Go to Shop"
            + "\nS - Save Game"
            + "\nF - Skip to Final Puzzle (temporary)"
            + "\nE - Exit Game"
            + "\n-----------------------------------";

    public void displayGameMenu() {
        char selection = ' ';
        do {
            System.out.println(GAME);
            
            String input = this.gameMenuRequest();
            selection = input.charAt(0);
            
            this.doGameSelection(selection);
            
        } while (selection != 'E');
    }
    
    private String gameMenuRequest() {
       boolean valid = false;
       String gameRequest = null;
       Scanner keyboard = new Scanner(System.in);
       
       while (!valid) {
          
           System.out.println("Select an option by entering the corresponding letter:");
           
           gameRequest = keyboard.nextLine();
           gameRequest = gameRequest.trim();
           
           if (gameRequest.length() == 0) {
               System.out.println("Invalid input - the value must not be blank");
               continue;
           }
           break;
       }
       return gameRequest;
    }
    
    private void doGameSelection(char selection) {
        
        switch (selection) {
            case 'I':
                this.viewInventory();
                break;
            case 'M':
                this.viewMap();
                break;
            case 'C':
                this.moveCharacter();
                break;
            case 'G':
                this.viewShop();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'F':
                this.finalPuzzle();
                break;
            case 'E':
                this.exitGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                       
        }

    }
    
    private void viewInventory() {
        InventoryControl.createInventory(MysticWater.getPlayer());
        
        InventoryView.inventory = new InventoryView();
        inventory.displayInventory();
    }

    private void viewMap() {
        System.out.println("viewMap function was called.");
    }

    private void moveCharacter() {
        System.out.println("moveCharacter function was called.");
    }

    private void viewShop() {
        System.out.println("viewShop function was called.");
    }

    private void saveGame() {
        System.out.println("saveGame function was called.");
    }

    private void finalPuzzle() {
        
        FinalPuzzleView.finalPuzzle = new FinalPuzzleView();
        finalPuzzle.displayFinalPuzzle();
    }

    private void exitGame() {
        System.out.println("exitGame function was called.");
    }
        
}
