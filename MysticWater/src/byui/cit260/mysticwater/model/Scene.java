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
public class Scene implements Serializable {

public enum SceneType {
    
    start,
    forestB,
    forestC,
    forestD,
    forestE,
    caveA,
    caveB,
    caveC,
    caveD,
    caveE,
    beachA,
    beachB,
    beachC,
    beachD,
    beachE,
    desertA,
    desertB,
    desertC,
    desertD,
    desertE,
    mountainsA,
    mountainsB,
    mountainsC,
    mountainsD,
    finish;
}
    
    private String description;
    private String mapSymbol;

    public Scene() {
//        this.description = description;
//        this.mapSymbol = mapSymbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + '}';
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }
}
