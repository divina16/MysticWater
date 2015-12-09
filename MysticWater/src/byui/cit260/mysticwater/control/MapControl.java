/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;

import byui.cit260.mysticwater.exceptions.MapControlException;
import byui.cit260.mysticwater.model.Game;
import byui.cit260.mysticwater.model.Location;
import byui.cit260.mysticwater.model.Map;
import byui.cit260.mysticwater.model.Scene;
import byui.cit260.mysticwater.model.Scene.SceneType;
import mysticwater.MysticWater;

/**
 *
 * @author Nina Sanchez
 */
public class MapControl {

    public static Map createMap() throws MapControlException {
            
            Map map = new Map(5, 5);
            Scene[] scene = createScenes();
            assignScenesToLocations(map, scene);
            return map;
    }

    private static void assignScenesToLocations(Map map, Scene[] scene) throws MapControlException {
        
        if (map == null || map == null) {
            throw new MapControlException("Error. No map was passed.");
    }
        if (scene == null || scene == null) {
            throw new MapControlException("Error. no scene was passed.");
    }
        
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scene[SceneType.start.ordinal()]);
        MysticWater.getPlayer().setLocation(locations[0][0]);
        locations[0][1].setScene(scene[SceneType.forestB.ordinal()]);
        locations[0][2].setScene(scene[SceneType.forestC.ordinal()]);
        locations[0][3].setScene(scene[SceneType.forestD.ordinal()]);
        locations[0][4].setScene(scene[SceneType.forestE.ordinal()]);
        
        locations[1][0].setScene(scene[SceneType.caveA.ordinal()]);
        locations[1][1].setScene(scene[SceneType.caveB.ordinal()]);
        locations[1][2].setScene(scene[SceneType.caveC.ordinal()]);
        locations[1][3].setScene(scene[SceneType.caveD.ordinal()]);
        locations[1][4].setScene(scene[SceneType.caveE.ordinal()]);
        
        locations[2][0].setScene(scene[SceneType.beachA.ordinal()]);
        locations[2][1].setScene(scene[SceneType.beachB.ordinal()]);
        locations[2][2].setScene(scene[SceneType.beachC.ordinal()]);
        locations[2][3].setScene(scene[SceneType.beachD.ordinal()]);
        locations[2][4].setScene(scene[SceneType.beachE.ordinal()]);
        
        locations[3][0].setScene(scene[SceneType.desertA.ordinal()]);
        locations[3][1].setScene(scene[SceneType.desertB.ordinal()]);
        locations[3][2].setScene(scene[SceneType.desertC.ordinal()]);
        locations[3][3].setScene(scene[SceneType.desertD.ordinal()]);
        locations[3][4].setScene(scene[SceneType.desertE.ordinal()]);
        
        locations[4][0].setScene(scene[SceneType.mountainsA.ordinal()]);
        locations[4][1].setScene(scene[SceneType.mountainsB.ordinal()]);
        locations[4][2].setScene(scene[SceneType.mountainsC.ordinal()]);
        locations[4][3].setScene(scene[SceneType.mountainsD.ordinal()]);
        locations[4][4].setScene(scene[SceneType.finish.ordinal()]);
        
        map.setLocations(locations);
    }
    
    private static Scene[] createScenes() throws MapControlException {
        Game game = MysticWater.getCurrentGame();
        
        Scene[] scene = new Scene[Constants.NUMBER_OF_SCENES];
        
        if (scene == null || scene == null) {
            throw new MapControlException("Error: No scene was passed.");
    }
        
        //forest (1-5)
        Scene start = new Scene();
        start.setDescription("               Forest A\n"
                + "----------------------------------------------"
                + "\nTinkerbell: Hello " + MysticWater.getCurrentGame().getPlayer().getName()
                + "! To move forward "
                + "\nin your joueney you must prove your knowledge. "
                + "\nAnswer this puzzle as many times as you like "
                + "\nand recieve a reward for a correct answer.");
        start.setMapSymbol("F1");
        scene[SceneType.start.ordinal()] = start;
        
        Scene forestB = new Scene();
        start.setDescription("");
        start.setMapSymbol("F2");
        scene[SceneType.forestB.ordinal()] = forestB;
        
        Scene forestC = new Scene();
        scene[SceneType.forestC.ordinal()] = forestC;
        
        Scene forestD = new Scene();
        scene[SceneType.forestD.ordinal()] = forestD;
        
        Scene forestE = new Scene();
        scene[SceneType.forestE.ordinal()] = forestE;
        
        //cave (6-10)
        Scene caveA = new Scene();
        scene[SceneType.caveA.ordinal()] = caveA;
        
        Scene caveB = new Scene();
        scene[SceneType.caveB.ordinal()] = caveB;
        
        Scene caveC = new Scene();
        scene[SceneType.caveC.ordinal()] = caveC;
        
        Scene caveD = new Scene();
        scene[SceneType.caveD.ordinal()] = caveD;
        
        Scene caveE = new Scene();
        scene[SceneType.caveE.ordinal()] = caveE;
        
        //beach (11-15)
        Scene beachA = new Scene();
        scene[SceneType.beachA.ordinal()] = beachA;
        
        Scene beachB = new Scene();
        scene[SceneType.beachB.ordinal()] = beachB;
        
        Scene beachC = new Scene();
        scene[SceneType.beachC.ordinal()] = beachC;
        
        Scene beachD = new Scene();
        scene[SceneType.beachD.ordinal()] = beachD;
        
        Scene beachE = new Scene();
        scene[SceneType.beachE.ordinal()] = beachE;
        
        //desert (16-20)
        Scene desertA = new Scene();
        scene[SceneType.desertA.ordinal()] = desertA;
        
        Scene desertB = new Scene();
        scene[SceneType.desertB.ordinal()] = desertB;
        
        Scene desertC = new Scene();
        scene[SceneType.desertC.ordinal()] = desertC;
        
        Scene desertD = new Scene();
        scene[SceneType.desertD.ordinal()] = desertD;
        
        Scene desertE = new Scene();
        scene[SceneType.desertE.ordinal()] = desertE;
        
        //mountains (21-25)
        Scene mountainsA = new Scene();
        scene[SceneType.mountainsA.ordinal()] = mountainsA;
        
        Scene mountainsB = new Scene();
        scene[SceneType.mountainsB.ordinal()] = mountainsB;
        
        Scene mountainsC = new Scene();
        scene[SceneType.mountainsC.ordinal()] = mountainsC;
        
        Scene mountainsD = new Scene();
        scene[SceneType.mountainsD.ordinal()] = mountainsD;
        
        Scene finish = new Scene();
        scene[SceneType.finish.ordinal()] = finish;
        
        return scene; 
    } 
}
