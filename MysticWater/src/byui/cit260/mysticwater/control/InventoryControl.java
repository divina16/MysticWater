/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;

import byui.cit260.mysticwater.model.Player;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class InventoryControl {

    public static void exit(Player player) {
    }

    public static void useItem(Player player) {
        
        InventoryControl.removeItem();
    }

    public static void addItem(int itemToAdd) {
        int currentQuantity = MysticWater.getCurrentGame().getInventory()[itemToAdd].getQuantity();
        MysticWater.getCurrentGame().getInventory()[itemToAdd].setQuantity(currentQuantity + 1);
    }

    public static void removeItem() {
    } 
}
