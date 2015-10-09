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
public class Player implements Serializable {
    
    private String name;
    private long playerTime;

    public Player() {
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getplayerTime() {
        return playerTime;
    }
    
    public void setplayerTime(long playerTime) {
        this.playerTime = playerTime;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", playerTime=" + playerTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + (int) (this.playerTime ^ (this.playerTime >>> 32));
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.playerTime != other.playerTime) {
            return false;
        }
        return true;
    }

}
