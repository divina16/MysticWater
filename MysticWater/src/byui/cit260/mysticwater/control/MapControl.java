/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;

import byui.cit260.mysticwater.model.Game;
import byui.cit260.mysticwater.model.Map;
import byui.cit260.mysticwater.model.Scene;
import byui.cit260.mysticwater.model.Scene.SceneType;
import mysticwater.MysticWater;

/**
 *
 * @author Nina Sanchez
 */
public class MapControl {

    public static Map createMap() {
            System.out.println("createMap() function inside MapControl was called.");
            
            Map map = new Map();
            
            Scene[] scene = createScenes();
            
            assignScenesToLocations(map, scene);
            
            return map;
    }

    private static void assignScenesToLocations(Map map, Scene[] scene) {
        System.out.println("assignScenesToLocations() in MapControl was called");  
    }
    
    private static Scene[] createScenes() {
        Game game = MysticWater.getCurrentGame();
        
        Scene[] scene = new Scene[Constants.NUMBER_OF_SCENES];
        
        //forest (1-5)
        Scene start = new Scene("Start", "A");
        scene[SceneType.start.ordinal()] = start;
        
        Scene forestB = new Scene("Forest B", "B");
        scene[SceneType.forestB.ordinal()] = forestB;
        
        Scene forestC = new Scene("Forest C", "C");
        scene[SceneType.forestC.ordinal()] = forestC;
        
        Scene forestD = new Scene("Forest D", "D");
        scene[SceneType.forestD.ordinal()] = forestD;
        
        Scene forestE = new Scene("Forest E", "E");
        scene[SceneType.forestE.ordinal()] = forestE;
        
        //cave (6-10)
        Scene caveA = new Scene("Cave A", "A");
        scene[SceneType.caveA.ordinal()] = caveA;
        
        Scene caveB = new Scene("Cave B", "B");
        scene[SceneType.caveB.ordinal()] = caveB;
        
        Scene caveC = new Scene("Cave C", "C");
        scene[SceneType.caveC.ordinal()] = caveC;
        
        Scene caveD = new Scene("Cave D", "D");
        scene[SceneType.caveD.ordinal()] = caveD;
        
        Scene caveE = new Scene("Cave E", "E");
        scene[SceneType.caveE.ordinal()] = caveE;
        
        //beach (11-15)
        Scene beachA = new Scene("Beach A", "A");
        scene[SceneType.beachA.ordinal()] = beachA;
        
        Scene beachB = new Scene("Beach B", "B");
        scene[SceneType.beachB.ordinal()] = beachB;
        
        Scene beachC = new Scene("Beach C", "C");
        scene[SceneType.beachC.ordinal()] = beachC;
        
        Scene beachD = new Scene("Beach D", "D");
        scene[SceneType.beachD.ordinal()] = beachD;
        
        Scene beachE = new Scene("Beach E", "E");
        scene[SceneType.beachE.ordinal()] = beachE;
        
        //desert (16-20)
        Scene desertA = new Scene("Desert A", "A");
        scene[SceneType.desertA.ordinal()] = desertA;
        
        Scene desertB = new Scene("Desert B", "B");
        scene[SceneType.desertB.ordinal()] = desertB;
        
        Scene desertC = new Scene("Desert C", "C");
        scene[SceneType.desertC.ordinal()] = desertC;
        
        Scene desertD = new Scene("Desert D", "D");
        scene[SceneType.desertD.ordinal()] = desertD;
        
        Scene desertE = new Scene("Desert E", "E");
        scene[SceneType.desertE.ordinal()] = desertE;
        
        //mountains (21-25)
        Scene mountainsA = new Scene("Mountains A", "A");
        scene[SceneType.mountainsA.ordinal()] = mountainsA;
        
        Scene mountainsB = new Scene("Mountains B", "B");
        scene[SceneType.mountainsB.ordinal()] = mountainsB;
        
        Scene mountainsC = new Scene("Mountains C", "C");
        scene[SceneType.mountainsC.ordinal()] = mountainsC;
        
        Scene mountainsD = new Scene("Mountains D", "D");
        scene[SceneType.mountainsD.ordinal()] = mountainsD;
        
        Scene finish = new Scene("Mountains E", "E");
        scene[SceneType.finish.ordinal()] = finish;
        
        return scene;  
    } 
}
