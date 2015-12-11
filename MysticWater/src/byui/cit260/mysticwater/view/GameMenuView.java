/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.GameControl;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class GameMenuView extends View {
    public static GameMenuView gameMenu;
    
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
            + "\nF - Skip to Final Puzzle"
            + "\nD - Skip to Distance Puzzle (temporary)"
            + "\nL - List of Actors"
            + "\nE - Exit"
            + "\n-----------------------------------");
}
    
    @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        

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
            case "D":
                this.distancePuzzle();
                break;
            case "L":
                this.actorReport();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                return false;              
        }
        return false;
    }
    
    private void viewInventory() {
        InventoryView.getInstance().displayView();
    }

    private void viewMap() {
        MapView.getInstance().displayView();
    }

    private void moveCharacter() {
        try {
            this.console.println("\n------------------");
            this.console.println("Current Location");
            this.console.println("------------------");
            this.console.println(MysticWater.getCurrentGame().getPlayer().getLocation().getScene());
            boolean isPuzzleScene = MysticWater.getCurrentGame().getPlayer().getLocation().isPuzzle();
        
        if (isPuzzleScene == true) {
            PuzzleView.getInstance().displayView();
            MoveCharacterView.getInstance().displayView();
        } else {
            MoveCharacterView.getInstance().displayView();
        }
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }   
    }

    private void viewShop() {
        ShopMenuView.getInstance().displayView();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where game"
                + " is to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(MysticWater.getCurrentGame(), filePath);
            this.console.println("Game saved successfully!");
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }
    
    private void distancePuzzle() {
        PuzzleView.getInstance().displayView();
    }    


    private void actorReport() {
        ActorReportView actorReport = new ActorReportView("");
        actorReport.displayView();
    }

    private void finalPuzzle() {
        FinalPuzzleView.getInstance().displayView();
    }
    
    public static GameMenuView getInstance() {
        
        if (gameMenu == null) {
            gameMenu = new GameMenuView();
        }
        return gameMenu;
    }
}
