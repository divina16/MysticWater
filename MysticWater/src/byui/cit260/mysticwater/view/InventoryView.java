/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.GameControl;
import byui.cit260.mysticwater.control.InventoryControl;
import byui.cit260.mysticwater.model.InventoryItem;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class InventoryView extends View {
    static InventoryView inventory;
    
    public InventoryView() {
        super("");
        
        String menu;
        menu = "\n"
            + "\n============================================"
            + "\n                 Inventory                  "
            + "\n============================================";
        
        //Get inventory list in game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        //for every item in the inventory list
        int counter = 1;
        for (InventoryItem nextInventoryItem : inventory) {
            menu += "\n" + String.format("%-2d", counter++) + " " + String.format("%-20s", nextInventoryItem.getDescription()) + " | " + "Success Rate - " + String.format("%-5.2f", nextInventoryItem.getSuccessRate()) + " | Quanity " + nextInventoryItem.getQuantity();   
        }
        
        menu += "\nE - Exit Inventory"
            + "\n============================================";
        
        this.setPromptMessage(menu);
    }

    @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        
         switch (selection) {
            case "15":
                this.buyRope();
                break;
            case "9":
                this.buyJetpack();
                break;
            case "1":
                this.buyAxe();
                break;
            case "22":
                this.buyUmbrella();
                break;
            case "11":
                this.buyPixieDust();
                break;
            case "24":
                this.buyWrench();
                break;
            case "5":
                this.buyFlyingShoes();
                break;
            case "10":
                this.buyLadder();
                break;
            case "12":
                this.buyPole();
                break;
            case "21":
                this.buySword();
                break;
            case "3":
                this.buyCandy();
                break;
            case "19":
                this.buySpork();
                break;
            case "17":
                this.buyShovel();
                break;
            case "16":
                this.buyRubberChicken();
                break;
            case "14":
                this.buyPulley();
                break;
            case "18":
                this.buySkateboard();
                break;
            case "20":
                this.buySurfboard();
                break;
            case "23":
                this.buyWaffles();
                break;
            case "2":
                this.buyCalculator();
                break;
            case "6":
                this.buyHolyGrail();
                break;
            case "8":
                this.buyJackHammer();
                break;
            case "4":
                this.buyCompass();
                break;
            case "13":
                this.buyPot();
                break;
            case "7":
                this.buyHunkOfMeat();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;            
        }
        return false;
    }

    private void buyRope() {    
                this.console.println("Rope was used.");
                InventoryControl.useItem(InventoryItem.Item.rope.ordinal());
    }

    private void buyUmbrella() {
                this.console.println("Umbrella was used.");
                InventoryControl.useItem(InventoryItem.Item.umbrella.ordinal());
    }

    private void buyPixieDust() {
                this.console.println("Pixie Dust was used.");
                InventoryControl.useItem(InventoryItem.Item.pixieDust.ordinal());
    }

    private void buyAxe() {
                this.console.println("Axe was used.");
                InventoryControl.useItem(InventoryItem.Item.axe.ordinal());
    }

    private void buyWrench() {
                this.console.println("Wrench was used.");
                InventoryControl.useItem(InventoryItem.Item.wrench.ordinal());
    }

    private void buyFlyingShoes() {
                this.console.println("FlyngShoes were used.");
                InventoryControl.useItem(InventoryItem.Item.flyingShoes.ordinal());    }

    private void buyLadder() {
                this.console.println("Ladder was used.");
                InventoryControl.useItem(InventoryItem.Item.ladder.ordinal());
    }

    private void buyPole() {
                this.console.println("Pole was used.");
                InventoryControl.useItem(InventoryItem.Item.pole.ordinal());
    }

    private void buySword() {
                this.console.println("Sword was used.");
                InventoryControl.useItem(InventoryItem.Item.sword.ordinal());
    }

    private void buyCandy() {
                this.console.println("Candy was used.");
                InventoryControl.useItem(InventoryItem.Item.candy.ordinal());
    }

    private void buySpork() {
                this.console.println("Spork was used.");
                InventoryControl.useItem(InventoryItem.Item.spork.ordinal());
    }

    private void buyShovel() {
                this.console.println("Shovel was used.");
                InventoryControl.useItem(InventoryItem.Item.shovel.ordinal());    }

    private void buyRubberChicken() {
                this.console.println("Rubber Chicken was used.");
                InventoryControl.useItem(InventoryItem.Item.rubberChicken.ordinal());
    }

    private void buyPulley() {
                this.console.println("Pulley was used.");
                InventoryControl.useItem(InventoryItem.Item.pulley.ordinal());
    }

    private void buySkateboard() {
                this.console.println("Skateboard was used.");
                InventoryControl.useItem(InventoryItem.Item.skateboard.ordinal());
    }

    private void buySurfboard() {
                this.console.println("Surfboard was used.");
                InventoryControl.useItem(InventoryItem.Item.surfboard.ordinal());
    }

    private void buyWaffles() {
                this.console.println("Waffles was used.");
                InventoryControl.useItem(InventoryItem.Item.waffles.ordinal());
    }

    private void buyCalculator() {
                this.console.println("Calculator was used.");
                InventoryControl.useItem(InventoryItem.Item.calculator.ordinal());
    }

    private void buyHolyGrail() {
                this.console.println("Holy Grail was used.");
                InventoryControl.useItem(InventoryItem.Item.holyGrail.ordinal());
    }

    private void buyJackHammer() {
                this.console.println("Jack Hammer was used.");
                InventoryControl.useItem(InventoryItem.Item.jackHammer.ordinal());
    }

    private void buyCompass() {
                this.console.println("Compass was used.");
                InventoryControl.useItem(InventoryItem.Item.compass.ordinal());
    }

    private void buyPot() {
                this.console.println("Pot was used.");
                InventoryControl.useItem(InventoryItem.Item.pot.ordinal());
    }

    private void buyHunkOfMeat() {
                this.console.println("Hunk of Meat was used.");
                InventoryControl.useItem(InventoryItem.Item.hunkOfMeat.ordinal());
    }
  
    private void buyJetpack() {
                this.console.println("Jetpack was used.");
                InventoryControl.useItem(InventoryItem.Item.jetpack.ordinal());    
    }
}
