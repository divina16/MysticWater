/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Trent Buckner
 */
public class Item implements Serializable {

    private String itemUsed;
    private String successRate;
    
    public Item() {
    }

    public String getItemUsed() {
        return itemUsed;
    }

    public void setItemUsed(String itemUsed) {
        this.itemUsed = itemUsed;
    }

    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }

    @Override
    public String toString() {
        return "Item{" + "itemUsed=" + itemUsed + ", successRate=" + successRate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.itemUsed);
        hash = 67 * hash + Objects.hashCode(this.successRate);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.itemUsed, other.itemUsed)) {
            return false;
        }
        if (!Objects.equals(this.successRate, other.successRate)) {
            return false;
        }
        return true;
    }

    

}
