/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Trent Buckner
 */
public class ItemList implements Serializable {
    
    public ArrayList<InventoryItem> inventory() {

        ArrayList<InventoryItem> inventory = new ArrayList<>();
    
    return inventory;
}
    
    private String itemName;
    private String successRate;
    
    public ItemList() {
    }
    
    public String getitemName() {
        return itemName;
    }
    
    public void setitemName(String itemName) {
        this.itemName = itemName;
    }
    
    public String getsuccessRate() {
        return successRate;
    }
    
    public void setsuccessRate(String successRate) {
        this.successRate = successRate;
    }

    @Override
    public String toString() {
        return "ItemList{" + "itemName=" + itemName + ", successRate=" + successRate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.itemName);
        hash = 17 * hash + Objects.hashCode(this.successRate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemList other = (ItemList) obj;
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.successRate, other.successRate)) {
            return false;
        }
        return true;
    }

}
