/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;

import byui.cit260.mysticwater.exceptions.InventoryControlException;
import byui.cit260.mysticwater.model.Player;
import byui.cit260.mysticwater.view.ErrorView;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class InventoryControl {

    public static void exit(Player player) {
    }

    public static void useItem(int itemToUse) throws InventoryControlException {
        boolean actorNeedsItem = MysticWater.getPlayer().getLocation().isActorNeedsItem();
        if (actorNeedsItem == true) {
            InventoryControl.removeItem(itemToUse);
        } else {
            ErrorView.display("InventoryControl", "There is no need to use an item here.");
        }      
    }

    public static void addItem(int itemToAdd) {
        int currentQuantity = MysticWater.getCurrentGame().getInventory()[itemToAdd].getQuantity();
        MysticWater.getCurrentGame().getInventory()[itemToAdd].setQuantity(currentQuantity + 1);
    }

    private static void removeItem(int itemToUse) {
        
        if (MysticWater.getCurrentGame().getInventory()[itemToUse].getQuantity() < 1) {
            ErrorView.display("InventoryControl", "\nInvalid input: You do not currently have any of that item. Please make a another selection.");
        } else {  
        int currentQuantity = MysticWater.getCurrentGame().getInventory()[itemToUse].getQuantity();
        MysticWater.getCurrentGame().getInventory()[itemToUse].setQuantity(currentQuantity - 1);
        MysticWater.getPlayer().getLocation().setActorNeedsItem(false);
        }
    }
}

