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
 * @author Trent Buckner & Nina Sanchez
 */
public class Actor implements Serializable {
    
    private String actorName;
    private String riddleSolved;
    private String answerRiddle;
    private float actorLocation;
    private String actorInventory;

    public Actor() {
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getRiddleSolved() {
        return riddleSolved;
    }

    public void setRiddleSolved(String riddleSolved) {
        this.riddleSolved = riddleSolved;
    }

    public String getAnswerRiddle() {
        return answerRiddle;
    }

    public void setAnswerRiddle(String answerRiddle) {
        this.answerRiddle = answerRiddle;
    }

    public double getActorLocation() {
        return actorLocation;
    }

    public void setActorLocation(float actorLocation) {
        this.actorLocation = actorLocation;
    }

    public String getActorInventory() {
        return actorInventory;
    }

    public void setActorInventory(String actorInventory) {
        this.actorInventory = actorInventory;
    }

    @Override
    public String toString() {
        return "Actor{" + "actorName=" + actorName + ", riddleSolved=" + riddleSolved + ", answerRiddle=" + answerRiddle + ", actorLocation=" + actorLocation + ", actorInventory=" + actorInventory + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.actorName);
        hash = 97 * hash + Objects.hashCode(this.riddleSolved);
        hash = 97 * hash + Objects.hashCode(this.answerRiddle);
        hash = 97 * hash + Float.floatToIntBits(this.actorLocation);
        hash = 97 * hash + Objects.hashCode(this.actorInventory);
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.actorName, other.actorName)) {
            return false;
        }
        if (!Objects.equals(this.riddleSolved, other.riddleSolved)) {
            return false;
        }
        if (!Objects.equals(this.answerRiddle, other.answerRiddle)) {
            return false;
        }
        if (Float.floatToIntBits(this.actorLocation) != Float.floatToIntBits(other.actorLocation)) {
            return false;
        }
        if (!Objects.equals(this.actorInventory, other.actorInventory)) {
            return false;
        }
        return true;
    }

}
