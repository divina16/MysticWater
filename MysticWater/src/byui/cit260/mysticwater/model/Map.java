/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.model;
import java.io.Serializable;

/**
 *
 * @author Nina Sanchez
 */
public class Map implements Serializable{
    private float noRows;
    private float noColumns;

    public Map() {
    }

    public float getNoRows() {
        return noRows;
    }

    public void setNoRows(float noRows) {
        this.noRows = noRows;
    }

    public float getNoColumns() {
        return noColumns;
    }

    public void setNoColumns(float noColumns) {
        this.noColumns = noColumns;
    }

    @Override
    public String toString() {
        return "Map{" + "noRows=" + noRows + ", noColumns=" + noColumns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Float.floatToIntBits(this.noRows);
        hash = 29 * hash + Float.floatToIntBits(this.noColumns);
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
        final Map other = (Map) obj;
        if (Float.floatToIntBits(this.noRows) != Float.floatToIntBits(other.noRows)) {
            return false;
        }
        if (Float.floatToIntBits(this.noColumns) != Float.floatToIntBits(other.noColumns)) {
            return false;
        }
        return true;
    }
    
    
}
