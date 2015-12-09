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
            throw new MapControlException("Error. no scene was passed.");
    }
        
        //forest (1-5)
        Scene start = new Scene("               Forest A\n"
                + "----------------------------------------------"
                + "\nTinkerbell: Hello " + MysticWater.getCurrentGame().getPlayer().getName()
                + "! To move forward "
                + "\nin your joueney you must prove your knowledge. "
                + "\nAnswer this puzzle as many times as you like "
                + "\nand recieve a reward for a correct answer.", "F1");
        scene[SceneType.start.ordinal()] = start;
        
        Scene forestB = new Scene("Forest B\n"
                + "\nNibs: " + MysticWater.getCurrentGame().getName() 
                + "! There is a fallen tree in your path. You need an "
                + "Item to chop the fallen tree. Go to the shop to "
                + "buy items.", "F2");
        scene[SceneType.forestB.ordinal()] = forestB;
        
        Scene forestC = new Scene("Forest C\n"
                + "\nSiren: " + MysticWater.getCurrentGame().getName() + "! UP HERE! HELP ME! "
                + "I am stuck in a tree! You need an item to help me "
                + "get down! ", "F3");
        scene[SceneType.forestC.ordinal()] = forestC;
        
        Scene forestD = new Scene("Forest D\nCharacters in this location:"
                + "\nTootles", "F4");
        scene[SceneType.forestD.ordinal()] = forestD;
        
        Scene forestE = new Scene("Forest E\nCharacters in this location:"
                + "\nForest Fairy", "F5");
        scene[SceneType.forestE.ordinal()] = forestE;
        
        //cave (6-10)
        Scene caveA = new Scene("Cave A\nCharacters in this location:"
                + "\nGolem", "C1");
        scene[SceneType.caveA.ordinal()] = caveA;
        
        Scene caveB = new Scene("Cave B\nCharacters in this location:"
                + "\nSlightly", "C2");
        scene[SceneType.caveB.ordinal()] = caveB;
        
        Scene caveC = new Scene("Cave C\nCharacters in this location:"
                + "\nCurly", "C3");
        scene[SceneType.caveC.ordinal()] = caveC;
        
        Scene caveD = new Scene("Cave D\nCharacters in this location:"
                + "\nPeter Pan", "C4");
        scene[SceneType.caveD.ordinal()] = caveD;
        
        Scene caveE = new Scene("Cave E\nCharacters in this location:"
                + "\nCave Fairy", "C5");
        scene[SceneType.caveE.ordinal()] = caveE;
        
        //beach (11-15)
        Scene beachA = new Scene("Beach A\nCharacters in this location:"
                + "\nWendy", "B1");
        scene[SceneType.beachA.ordinal()] = beachA;
        
        Scene beachB = new Scene("Beach B\nCharacters in this location:"
                + "\nMermaid", "B2");
        scene[SceneType.beachB.ordinal()] = beachB;
        
        Scene beachC = new Scene("Beach C\nCharacters in this location:"
                + "\nSmee", "B3");
        scene[SceneType.beachC.ordinal()] = beachC;
        
        Scene beachD = new Scene("Beach D\nCharacters in this location:"
                + "\n/Hook", "B4");
        scene[SceneType.beachD.ordinal()] = beachD;
        
        Scene beachE = new Scene("Beach E\nCharacters in this location:"
                + "\nWater Fairy", "B5");
        scene[SceneType.beachE.ordinal()] = beachE;
        
        //desert (16-20)
        Scene desertA = new Scene("Desert A\nCharacters in this location:"
                + "\nSandman", "D1");
        scene[SceneType.desertA.ordinal()] = desertA;
        
        Scene desertB = new Scene("Desert B\nCharacters in this location:"
                + "\nJohn", "D2");
        scene[SceneType.desertB.ordinal()] = desertB;
        
        Scene desertC = new Scene("Desert C\nCharacters in this location:"
                + "\nMicheal", "D3");
        scene[SceneType.desertC.ordinal()] = desertC;
        
        Scene desertD = new Scene("Desert D\nCharacters in this location:"
                + "\nThomas", "D4");
        scene[SceneType.desertD.ordinal()] = desertD;
        
        Scene desertE = new Scene("Desert E\nCharacters in this location:"
                + "\nPrentiss", "D5");
        scene[SceneType.desertE.ordinal()] = desertE;
        
        //mountains (21-25)
        Scene mountainsA = new Scene("Mountains A\nCharacters in this location:"
                + "\nTwins", "M1");
        scene[SceneType.mountainsA.ordinal()] = mountainsA;
        
        Scene mountainsB = new Scene("Mountains B\nCharacters in this location:"
                + "\nPockets", "M2");
        scene[SceneType.mountainsB.ordinal()] = mountainsB;
        
        Scene mountainsC = new Scene("Mountains C\nCharacters in this location:"
                + "\nAce", "M3");
        scene[SceneType.mountainsC.ordinal()] = mountainsC;
        
        Scene mountainsD = new Scene("Mountains D\nCharacters in this location:"
                + "\nThudbutt", "M4");
        scene[SceneType.mountainsD.ordinal()] = mountainsD;
        
        Scene finish = new Scene("Finish\nCharacters in this location:"
                + "\nDragon", "M5");
        scene[SceneType.finish.ordinal()] = finish;
        
        return scene; 
    } 
}
