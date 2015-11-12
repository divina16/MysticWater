/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;

import byui.cit260.mysticwater.model.Player;

/**
 *
 * @author Trent Buckner
 */
public class InventoryControl {

    public static void createInventory(Player player) {
        System.out.println("createInventory function in InventoryControl class was called");
    }

    public static void exit(Player player) {
        System.out.println("exit function in InventoryControl class was called");
    }

    public static void useItem(Player player) {
        System.out.println("\nuseItem function in InventoryContol class was called");
    }

    public static void addItem(Player player) {
        System.out.println("\naddItem function in InventoryContol class was called");
    }
    
}
