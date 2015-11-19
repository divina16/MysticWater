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
            menu += "\n" + counter++ + " " + nextInventoryItem.getDescription() + " | " + "Success Rate - " + nextInventoryItem.getSuccessRate() + " | Quanity " + nextInventoryItem.getQuantity();
            
        }
            //print menu item
        menu += "\nE - Exit Inventory"
            + "\n============================================";
        this.setPromptMessage(menu);
    }

    @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        
        switch (selection) {
            case "1":
                this.itemOne();
                break;
            case "2":
                this.itemTwo();
                break;
            case "3":
                this.itemThree();
                break;
            case "4":
                this.itemFour();
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

    private void exit() {
        InventoryControl.exit(MysticWater.getPlayer());
    }

    private void itemOne() {
        InventoryControl.useItem(MysticWater.getPlayer());
    }

    private void itemTwo() {
        InventoryControl.useItem(MysticWater.getPlayer());
    }

    private void itemThree() {
        InventoryControl.useItem(MysticWater.getPlayer());
    }

    private void itemFour() {
        InventoryControl.useItem(MysticWater.getPlayer());
    }
    
    }
