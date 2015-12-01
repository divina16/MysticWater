/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.GameControl;
import byui.cit260.mysticwater.control.InventoryControl;
import byui.cit260.mysticwater.model.InventoryItem;
import byui.cit260.mysticwater.model.InventoryItem.Item;

/**
 *
 * @author Nina
 */
public class ShopMenuView extends View {
    static ShopMenuView shopMenu;
    static ShopMenuView shop;

    public ShopMenuView() {
        super("");
        
        String menu;
        menu = "\n"
            + "\n============================================"
            + "\n                 Shop Menu                  "
            + "\n============================================";
        
        //Get inventory list in game to put in shop
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        //for every item in the shop list
        int counter = 1;
        for (InventoryItem nextInventoryItem : inventory) {
            menu += "\n" + String.format("%-2d", counter++) + " " + String.format("%-20s", nextInventoryItem.getDescription()) + " | " + "Success Rate - " + String.format("%-5.2f", nextInventoryItem.getSuccessRate()) + " | Price " + nextInventoryItem.getPrice();   
        }
        
            menu += "\nE - Exit Shop"
            + "\n============================================";
        
        this.setPromptMessage(menu);
    }
    

    @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        
        switch (selection) {
            case "1":
                this.buyRope();
                break;
            case "2":
                this.buyJetpack();
                break;
            case "3":
                this.buyAxe();
                break;
            case "4":
                this.buyUmbrella();
                break;
            case "5":
                this.buyPixieDust();
                break;
            case "6":
                this.buyWrench();
                break;
            case "7":
                this.buyFlyingShoes();
                break;
            case "8":
                this.buyLadder();
                break;
            case "9":
                this.buyPole();
                break;
            case "10":
                this.buySword();
                break;
            case "11":
                this.buyCandy();
                break;
            case "12":
                this.buySpork();
                break;
            case "13":
                this.buyShovel();
                break;
            case "14":
                this.buyRubberChicken();
                break;
            case "15":
                this.buyPulley();
                break;
            case "16":
                this.buySkateboard();
                break;
            case "17":
                this.buySurfboard();
                break;
            case "18":
                this.buyWaffles();
                break;
            case "19":
                this.buyCalculator();
                break;
            case "20":
                this.buyHolyGrail();
                break;
            case "21":
                this.buyJackHammer();
                break;
            case "22":
                this.buyCompass();
                break;
            case "23":
                this.buyPot();
                break;
            case "24":
                this.buyHunkOfMeat();
                break;
            case "E":
                this.exit();
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;            
        }
        return false;
    }

    private void buyRope() {    
                System.out.println("Rope was purchased.");
                InventoryControl.addItem(Item.rope.ordinal());
    }

    private void buyUmbrella() {
                System.out.println("Umbrella was purchased.");
                InventoryControl.addItem(Item.umbrella.ordinal());
    }

    private void buyPixieDust() {
                System.out.println("Pixie Dust was purchased.");
                InventoryControl.addItem(Item.pixieDust.ordinal());
    }

    private void buyAxe() {
                System.out.println("Axe was purchased.");
                InventoryControl.addItem(Item.axe.ordinal());
    }

    private void buyWrench() {
                System.out.println("Wrench was purchased.");
                InventoryControl.addItem(Item.wrench.ordinal());
    }

    private void buyFlyingShoes() {
                System.out.println("FlyngShoes were purchased.");
                InventoryControl.addItem(Item.flyingShoes.ordinal());    }

    private void buyLadder() {
                System.out.println("Ladder was purchased.");
                InventoryControl.addItem(Item.ladder.ordinal());
    }

    private void buyPole() {
                System.out.println("Pole was purchased.");
                InventoryControl.addItem(Item.pole.ordinal());
    }

    private void buySword() {
                System.out.println("Sword was purchased.");
                InventoryControl.addItem(Item.sword.ordinal());
    }

    private void buyCandy() {
                System.out.println("Candy was purchased.");
                InventoryControl.addItem(Item.candy.ordinal());
    }

    private void buySpork() {
                System.out.println("Spork was purchased.");
                InventoryControl.addItem(Item.spork.ordinal());
    }

    private void buyShovel() {
                System.out.println("Shovel was purchased.");
                InventoryControl.addItem(Item.shovel.ordinal());    }

    private void buyRubberChicken() {
                System.out.println("Rubber Chicken was purchased.");
                InventoryControl.addItem(Item.rubberChicken.ordinal());
    }

    private void buyPulley() {
                System.out.println("Pulley was purchased.");
                InventoryControl.addItem(Item.pulley.ordinal());
    }

    private void buySkateboard() {
                System.out.println("Skateboard was purchased.");
                InventoryControl.addItem(Item.skateboard.ordinal());
    }

    private void buySurfboard() {
                System.out.println("Surfboard was purchased.");
                InventoryControl.addItem(Item.surfboard.ordinal());
    }

    private void buyWaffles() {
                System.out.println("Waffles was purchased.");
                InventoryControl.addItem(Item.waffles.ordinal());
    }

    private void buyCalculator() {
                System.out.println("Calculator was purchased.");
                InventoryControl.addItem(Item.calculator.ordinal());
    }

    private void buyHolyGrail() {
                System.out.println("Holy Grail was purchased.");
                InventoryControl.addItem(Item.holyGrail.ordinal());
    }

    private void buyJackHammer() {
                System.out.println("Jack Hammer was purchased.");
                InventoryControl.addItem(Item.jackHammer.ordinal());
    }

    private void buyCompass() {
                System.out.println("Compass was purchased.");
                InventoryControl.addItem(Item.compass.ordinal());
    }

    private void buyPot() {
                System.out.println("Pot was purchased.");
                InventoryControl.addItem(Item.pot.ordinal());
    }

    private void buyHunkOfMeat() {
                System.out.println("Hunk of Meat was purchased.");
                InventoryControl.addItem(Item.hunkOfMeat.ordinal());
    }
  
    private void buyJetpack() {
                System.out.println("Jetpack was purchased.");
                InventoryControl.addItem(Item.jetpack.ordinal());    }
    
    private void exit() {
                System.out.println("backToGame was called");

    }

}
