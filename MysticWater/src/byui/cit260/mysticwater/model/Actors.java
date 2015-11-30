/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Trent Buckner & Nina Sanchez
 */
public class Actors implements Serializable{

public enum Actor {
    
    golem,
    dragon,
    siren,
    mermaid,
    sandman,
    waterFairy,
    tootles,
    nibs,
    slightly,
    curly,
    peterPan,
    twins,
    hook,
    smee,
    tinkerbell,
    forestFairy,
    caveFairy,
    wendy,
    john,
    micheal,
    ted,
    thomas,
    prentiss,
    pockets,
    ace,
    thudButt;
}

    private String description;
    private Point coordinates;

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Actor{" + "description=" + description + ", coordinates=" + coordinates + '}';
    }
}

