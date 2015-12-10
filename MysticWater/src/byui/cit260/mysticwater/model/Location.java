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
    
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private boolean puzzle;
    private boolean distancePuzzle;
    private boolean finalPuzzle;
    private boolean actorNeedsItem;

    public boolean isDistancePuzzle() {
        return distancePuzzle;
    }

    public void setDistancePuzzle(boolean distancePuzzle) {
        this.distancePuzzle = distancePuzzle;
    }

    public boolean isFinalPuzzle() {
        return finalPuzzle;
    }

    public void setFinalPuzzle(boolean finalPuzzle) {
        this.finalPuzzle = finalPuzzle;
    }

    public boolean isActorNeedsItem() {
        return actorNeedsItem;
    }

    public void setActorNeedsItem(boolean actorNeedsItem) {
        this.actorNeedsItem = actorNeedsItem;
    }

    public boolean isPuzzle() {
        return puzzle;
    }

    public void setPuzzle(boolean puzzle) {
        this.puzzle = puzzle;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Float.floatToIntBits(this.row);
        hash = 29 * hash + Float.floatToIntBits(this.column);
        hash = 29 * hash + (this.visited ? 1 : 0);
        hash = 29 * hash + Objects.hashCode(this.scene);
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
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", scene=" + scene + '}';
    }


}
