/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.InventoryControl;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class InventoryView extends View {
    static InventoryView inventory;
    
    public InventoryView() {
        super("\n"
            + "\n============================================"
            + "\n                 Inventory                  "
            + "\n============================================"
            + "\n1. Rope - 1/5"
            + "\n2. Umbrella - 1/4"
            + "\n3. Jetpack - 5/20"
            + "\n4. Axe - 2/5"
            + "\nE - Exit Inventory"
            + "\n============================================");
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
