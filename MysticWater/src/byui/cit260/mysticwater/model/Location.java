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
 * @author Nina Sanchez
 */
public class Location implements Serializable{
    
    private float row;
    private float column;
    private boolean visited;
    private Scene scene;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Location() {
    }

    public float getRow() {
        return row;
    }

    public void setRow(float row) {
        this.row = row;
    }

    public float getColumn() {
        return column;
    }

    public void setColumn(float column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Float.floatToIntBits(this.row);
        hash = 73 * hash + Float.floatToIntBits(this.column);
        hash = 73 * hash + Objects.hashCode(this.visited);
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
        final Location other = (Location) obj;
        if (Float.floatToIntBits(this.row) != Float.floatToIntBits(other.row)) {
            return false;
        }
        if (Float.floatToIntBits(this.column) != Float.floatToIntBits(other.column)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        return true;
    }
    
}
