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
            menu += "\n" + String.format("%-2d", counter++) + " " + String.format("%-20s", nextInventoryItem.getDescription()) + " | Price " + nextInventoryItem.getPrice();   
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
                this.console.println("Rope was purchased.");
                InventoryControl.addItem(Item.rope.ordinal());
    }

    private void buyUmbrella() {
                this.console.println("Umbrella was purchased.");
                InventoryControl.addItem(Item.umbrella.ordinal());
    }

    private void buyPixieDust() {
                this.console.println("Pixie Dust was purchased.");
                InventoryControl.addItem(Item.pixieDust.ordinal());
    }

    private void buyAxe() {
                this.console.println("Axe was purchased.");
                InventoryControl.addItem(Item.axe.ordinal());
    }

    private void buyWrench() {
                this.console.println("Wrench was purchased.");
                InventoryControl.addItem(Item.wrench.ordinal());
    }

    private void buyFlyingShoes() {
                this.console.println("FlyngShoes were purchased.");
                InventoryControl.addItem(Item.flyingShoes.ordinal());    }

    private void buyLadder() {
                this.console.println("Ladder was purchased.");
                InventoryControl.addItem(Item.ladder.ordinal());
    }

    private void buyPole() {
                this.console.println("Pole was purchased.");
                InventoryControl.addItem(Item.pole.ordinal());
    }

    private void buySword() {
                this.console.println("Sword was purchased.");
                InventoryControl.addItem(Item.sword.ordinal());
    }

    private void buyCandy() {
                this.console.println("Candy was purchased.");
                InventoryControl.addItem(Item.candy.ordinal());
    }

    private void buySpork() {
                this.console.println("Spork was purchased.");
                InventoryControl.addItem(Item.spork.ordinal());
    }

    private void buyShovel() {
                this.console.println("Shovel was purchased.");
                InventoryControl.addItem(Item.shovel.ordinal());    }

    private void buyRubberChicken() {
                this.console.println("Rubber Chicken was purchased.");
                InventoryControl.addItem(Item.rubberChicken.ordinal());
    }

    private void buyPulley() {
                this.console.println("Pulley was purchased.");
                InventoryControl.addItem(Item.pulley.ordinal());
    }

    private void buySkateboard() {
                this.console.println("Skateboard was purchased.");
                InventoryControl.addItem(Item.skateboard.ordinal());
    }

    private void buySurfboard() {
                this.console.println("Surfboard was purchased.");
                InventoryControl.addItem(Item.surfboard.ordinal());
    }

    private void buyWaffles() {
                this.console.println("Waffles was purchased.");
                InventoryControl.addItem(Item.waffles.ordinal());
    }

    private void buyCalculator() {
                this.console.println("Calculator was purchased.");
                InventoryControl.addItem(Item.calculator.ordinal());
    }

    private void buyHolyGrail() {
                this.console.println("Holy Grail was purchased.");
                InventoryControl.addItem(Item.holyGrail.ordinal());
    }

    private void buyJackHammer() {
                this.console.println("Jack Hammer was purchased.");
                InventoryControl.addItem(Item.jackHammer.ordinal());
    }

    private void buyCompass() {
                this.console.println("Compass was purchased.");
                InventoryControl.addItem(Item.compass.ordinal());
    }

    private void buyPot() {
                this.console.println("Pot was purchased.");
                InventoryControl.addItem(Item.pot.ordinal());
    }

    private void buyHunkOfMeat() {
                this.console.println("Hunk of Meat was purchased.");
                InventoryControl.addItem(Item.hunkOfMeat.ordinal());
    }
  
    private void buyJetpack() {
                this.console.println("Jetpack was purchased.");
                InventoryControl.addItem(Item.jetpack.ordinal());    }
    
    public static ShopMenuView getInstance() {
        
        if (shop == null) {
            shop = new ShopMenuView();
        }
        return shop;
    }
}
