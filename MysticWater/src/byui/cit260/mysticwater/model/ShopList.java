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
public class ShopList implements Serializable {
    
    private String shopList;
    private String itemPrice;
    private String successRate;
    private String itemSold;

    public ShopList() {
    }

    public String getShopList() {
        return shopList;
    }

    public void setShopList(String shopList) {
        this.shopList = shopList;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }

    public String getItemSold() {
        return itemSold;
    }

    public void setItemSold(String itemSold) {
        this.itemSold = itemSold;
    }

    @Override
    public String toString() {
        return "ShopList{" + "shopList=" + shopList + ", itemPrice=" + itemPrice + ", successRate=" + successRate + ", itemSold=" + itemSold + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.shopList);
        hash = 17 * hash + Objects.hashCode(this.itemPrice);
        hash = 17 * hash + Objects.hashCode(this.successRate);
        hash = 17 * hash + Objects.hashCode(this.itemSold);
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
        final ShopList other = (ShopList) obj;
        if (!Objects.equals(this.shopList, other.shopList)) {
            return false;
        }
        if (!Objects.equals(this.itemPrice, other.itemPrice)) {
            return false;
        }
        if (!Objects.equals(this.successRate, other.successRate)) {
            return false;
        }
        if (!Objects.equals(this.itemSold, other.itemSold)) {
            return false;
        }
        return true;
    }

}
