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
    private Location[][] locations;

    public Map() {
    }
    
    public Map(int noRows, int noColumns) {
        
        if (noRows < 1 || noColumns < 1){
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noRows = noRows;
        this.noColumns = noColumns;
        
        //create 2-D array for Location objects
        this.locations = new Location[noRows][noColumns];
        
        for (int row = 0; row < noRows; row++) {
            for (int column = 0; column < noColumns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
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

    public Location[][] getLocations() {
        return locations;  
    }
}
