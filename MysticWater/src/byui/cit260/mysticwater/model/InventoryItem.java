/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.model;

/**
 *
 * @author Trent Buckner
 */

public class InventoryItem {

public enum Item {
    
    rope,
    jetpack,
    axe,
    umbrella,
    pixieDust,
    wrench,
    flyingShoes,
    ladder,
    pole,
    sword,
    candy,
    spork,
    shovel,
    rubberChicken,
    pulley,
    skateboard,
    surfboard,
    waffles,
    calculator,
    holyGrail,
    jackHammer,
    compass,
    pot,
    hunkOfMeat;
}

//    private String itemUsed;
    private double successRate;
    private String description;
    private int quantity;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public InventoryItem(double rate) {
        this.successRate = rate;
    }

    public double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(double successRate) {
        this.successRate = successRate;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" + ", successRate=" + successRate + '}';
    }
}
