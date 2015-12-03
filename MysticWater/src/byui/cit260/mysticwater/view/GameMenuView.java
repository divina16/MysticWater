/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.GameControl;
import static byui.cit260.mysticwater.view.FinalPuzzleView.finalPuzzle;
import byui.cit260.mysticwater.control.MoveCharacterControl;
import static byui.cit260.mysticwater.view.DistancePuzzleView.distancePuzzle;
import static byui.cit260.mysticwater.view.InventoryView.inventory;
import static byui.cit260.mysticwater.view.MapView.map;
import static byui.cit260.mysticwater.view.ShopMenuView.shop;
import static byui.cit260.mysticwater.view.MoveCharacterView.move;
import static byui.cit260.mysticwater.view.PuzzleView.nPuzzle;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class GameMenuView extends View {
    static GameMenuView gameMenu;
    
    public GameMenuView() {
    super("\n"
            + "\n-----------------------------------"
            + "\n|Game Menu                        |"
            + "\n-----------------------------------"
            + "\nI - View Inventory"
            + "\nM - View Map"
            + "\nC - Move Character"
            + "\nG - Go to Shop"
            + "\nS - Save Game"
            + "\nF - Skip to Final Puzzle (temporary)"
            + "\nP - Skip to Puzzle (temporary)"
            + "\nD - Skip to Distance Puzzle (temporary)"
            + "\nE - Exit Game"
            + "\n-----------------------------------");
}
    
    @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        
        boolean done = false;
        
        switch (selection) {
            case "I":
                this.viewInventory();
                break;
            case "M":
                this.viewMap();
                break;
            case "C":
                this.moveCharacter();
                break;
            case "G":
                this.viewShop();
                break;
            case "S":
                this.saveGame();
                break;
            case "F":
                this.finalPuzzle();
                break;
            case "P":
                this.puzzle();
                break;
            case "D":
                this.distancePuzzle();
                break;
            case "E":
                done = true;
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                return false;
                       
        }
        return done;
    }
    
    private void viewInventory() {
        InventoryView.inventory = new InventoryView();
        inventory.displayView();
    }

    private void viewMap() {
        MapView.map = new MapView();
        map.displayView();
    }

    private void moveCharacter() {
        MoveCharacterControl.createMoveCharacter(MysticWater.getPlayer()); 
        
        MoveCharacterView.move = new MoveCharacterView();
        move.displayView();
    }

    private void viewShop() {
        ShopMenuView.shop = new ShopMenuView();
        shop.displayView();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where game"
                + " is to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(MysticWater.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void finalPuzzle() {
        FinalPuzzleView.finalPuzzle = new FinalPuzzleView();
        finalPuzzle.displayView();
    }
    
    private void puzzle() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }
    
    private void distancePuzzle() {
        DistancePuzzleView.distancePuzzle = new DistancePuzzleView();
        distancePuzzle.displayView();
    }    
}
