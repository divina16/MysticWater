/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.InventoryControl;
import byui.cit260.mysticwater.model.InventoryItem;
import byui.cit260.mysticwater.model.InventoryItem.Item;
import mysticwater.MysticWater;

/**
 *
 * @author Braden
 */
public class ShopMenuView extends View {
    static ShopMenuView shopMenu;
    static ShopMenuView shop;

    public ShopMenuView() {
        super("\n"
            + "\n============================================"
            + "\n                 Shop Menu                  "
            + "\n============================================"
            + "\n1 - 100 coins - Rope"
            + "\n2 - 50 coins - Umbrella"
            + "\n3 - 500 coins - Pixie Dust"
            + "\n4 - 250 coins - Axe"
            + "\n5 - 120 coins - Wrench"
            + "\nE - Exit Shop"
            + "\n============================================");
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
                this.buyUmbrella();
                break;
            case "3":
                this.buyPixieDust();
                break;
            case "4":
                this.buyAxe();
                break;
            case "5":
                this.buyWrench();
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

    private void exit() {
                System.out.println("backToGame was called");

    }

}
