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
import byui.cit260.mysticwater.model.Player;
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
        
        //forest locations
        locations[0][0].setScene(scene[SceneType.start.ordinal()]);
        locations[0][0].setVisited(true);
        MysticWater.getPlayer().setLocation(locations[0][0]); //set player to start location
        locations[0][0].setPuzzle(true);
        locations[0][1].setScene(scene[SceneType.forestB.ordinal()]);
        locations[0][1].setVisited(false);
        locations[0][1].setPuzzle(false);
        locations[0][1].setActorNeedsItem(true);
        locations[0][2].setScene(scene[SceneType.forestC.ordinal()]);
        locations[0][2].setVisited(false);
        locations[0][2].setPuzzle(false);
        locations[0][2].setActorNeedsItem(true);
        locations[0][3].setScene(scene[SceneType.forestD.ordinal()]);
        locations[0][3].setVisited(false);
        locations[0][3].setPuzzle(false);
        locations[0][3].setActorNeedsItem(true);
        locations[0][4].setScene(scene[SceneType.forestE.ordinal()]);
        locations[0][4].setVisited(false);
        locations[0][4].setPuzzle(true);
        
        //cave locations
        locations[1][0].setScene(scene[SceneType.caveA.ordinal()]);
        locations[1][0].setVisited(false);
        locations[1][0].setPuzzle(false);
        locations[1][0].setActorNeedsItem(true);
        locations[1][1].setScene(scene[SceneType.caveB.ordinal()]);
        locations[1][1].setVisited(false);
        locations[1][1].setPuzzle(false);
        locations[1][1].setActorNeedsItem(true);
        locations[1][2].setScene(scene[SceneType.caveC.ordinal()]);
        locations[1][2].setVisited(false);
        locations[1][2].setPuzzle(false);
        locations[1][2].setActorNeedsItem(true);
        locations[1][3].setScene(scene[SceneType.caveD.ordinal()]);
        locations[1][3].setVisited(false);
        locations[1][3].setPuzzle(false);
        locations[1][3].setActorNeedsItem(true);
        locations[1][4].setScene(scene[SceneType.caveE.ordinal()]);
        locations[1][4].setVisited(false);
        locations[1][4].setPuzzle(true);
        
        //beach locations
        locations[2][0].setScene(scene[SceneType.beachA.ordinal()]);
        locations[2][0].setVisited(false);
        locations[2][0].setPuzzle(false);
        locations[2][0].setActorNeedsItem(true);
        locations[2][1].setScene(scene[SceneType.beachB.ordinal()]);
        locations[2][1].setVisited(false);
        locations[2][1].setPuzzle(false);
        locations[2][1].setActorNeedsItem(true);
        locations[2][2].setScene(scene[SceneType.beachC.ordinal()]);
        locations[2][2].setVisited(false);
        locations[2][2].setPuzzle(false);
        locations[2][2].setActorNeedsItem(true);
        locations[2][3].setScene(scene[SceneType.beachD.ordinal()]);
        locations[2][3].setVisited(false);
        locations[2][3].setPuzzle(false);
        locations[2][3].setActorNeedsItem(true);
        locations[2][4].setScene(scene[SceneType.beachE.ordinal()]);
        locations[2][4].setVisited(false);
        locations[2][4].setPuzzle(true);
        
        //desert locations
        locations[3][0].setScene(scene[SceneType.desertA.ordinal()]);
        locations[3][0].setVisited(false);
        locations[3][0].setPuzzle(false);
        locations[3][0].setActorNeedsItem(true);
        locations[3][1].setScene(scene[SceneType.desertB.ordinal()]);
        locations[3][1].setVisited(false);
        locations[3][1].setPuzzle(false);
        locations[3][1].setActorNeedsItem(true);
        locations[3][2].setScene(scene[SceneType.desertC.ordinal()]);
        locations[3][2].setVisited(false);
        locations[3][2].setPuzzle(false);
        locations[3][2].setActorNeedsItem(true);
        locations[3][3].setScene(scene[SceneType.desertD.ordinal()]);
        locations[3][3].setVisited(false);
        locations[3][3].setPuzzle(false);
        locations[3][3].setActorNeedsItem(true);
        locations[3][4].setScene(scene[SceneType.desertE.ordinal()]);
        locations[3][4].setVisited(false);
        locations[3][4].setPuzzle(true);
        
        //mountain locations
        locations[4][0].setScene(scene[SceneType.mountainsA.ordinal()]);
        locations[4][0].setVisited(false);
        locations[4][0].setPuzzle(false);
        locations[4][0].setActorNeedsItem(true);
        locations[4][1].setScene(scene[SceneType.mountainsB.ordinal()]);
        locations[4][1].setVisited(false);
        locations[4][1].setPuzzle(false);
        locations[4][1].setActorNeedsItem(true);
        locations[4][2].setScene(scene[SceneType.mountainsC.ordinal()]);
        locations[4][2].setVisited(false);
        locations[4][2].setPuzzle(false);
        locations[4][2].setActorNeedsItem(true);
        locations[4][3].setScene(scene[SceneType.mountainsD.ordinal()]);
        locations[4][3].setVisited(false);
        locations[4][3].setPuzzle(false);
        locations[4][3].setActorNeedsItem(true);
        locations[4][4].setScene(scene[SceneType.finish.ordinal()]);
        locations[4][4].setVisited(false);
        locations[4][4].setFinalPuzzle(true);
        
        map.setLocations(locations);
    }
    
    private static Scene[] createScenes() throws MapControlException {
        Game game = MysticWater.getCurrentGame();
        
        Scene[] scene = new Scene[Constants.NUMBER_OF_SCENES];
        
        if (scene == null || scene == null) {
            throw new MapControlException("Error: No scene was passed.");
    }
        
        //forest (1-5)
        Scene start = new Scene("\n               Forest A\n"
                + "----------------------------------------------"
                + "\nTinkerbell: Hello " + MysticWater.getCurrentGame().getPlayer().getName()
                + "! To move forward "
                + "\nin your joueney you must prove your knowledge. "
                + "\nAnswer this puzzle as many times as you like "
                + "\nand recieve a reward for a correct answer.", "F1");
        scene[SceneType.start.ordinal()] = start;
        
        Scene forestB = new Scene("\n             Forest B\n"
                + "----------------------------------------------"
                + "\nNibs: Hey " + MysticWater.getCurrentGame().getPlayer().getName() 
                + "! There is a fallen tree "
                + "\nin your path. You need an "
                + "\nItem to chop the fallen tree. "
                + "\nGo to the shop to "
                + "buy items. Axe", "F2");
        scene[SceneType.forestB.ordinal()] = forestB;
        
        Scene forestC = new Scene("\n             Forest C\n"
                + "----------------------------------------------"
                + "\nSiren: Oh " + MysticWater.getCurrentGame().getPlayer().getName() + "! UP HERE! HELP ME! "
                + "\nI am stuck in a tree! You need an item to help me "
                + "\nget down! Ladder ", "F3");
        scene[SceneType.forestC.ordinal()] = forestC;
        
        Scene forestD = new Scene("\n             Forest D\n"
                + "----------------------------------------------"
                + "\nTootles: Hey" + MysticWater.getCurrentGame().getPlayer().getName() + "! There is a loose nut on this bridge ahead. "
                + "\nIf you bring me a tool I might be able to fix it. Wrench", "F4");
        scene[SceneType.forestD.ordinal()] = forestD;
        
        Scene forestE = new Scene("\n             Forest E\n"
                + "----------------------------------------------"
                + "\nForest Fairy: Hello " + MysticWater.getCurrentGame().getPlayer().getName()
                + "! To move forward "
                + "\nin your joueney you must prove your knowledge. "
                + "\nAnswer this puzzle as many times as you like "
                + "\nand recieve a reward for a correct answer.", "F5");
        scene[SceneType.forestE.ordinal()] = forestE;
        
        //cave (6-10)
        Scene caveA = new Scene("\n               Cave A\n"
                + "----------------------------------------------"
                + "\nGolem: EEEEK! You shall not pass! "
                + "\nonly friends who bring me funny "
                + "\nthings can pass through this cave. rubberchicken", "C1");
        scene[SceneType.caveA.ordinal()] = caveA;
        
        Scene caveB = new Scene("\n               Cave B\n"
                + "----------------------------------------------"
                + "\nSlightly: Oh hey "+ MysticWater.getCurrentGame().getPlayer().getName() + "! I have a yummy carrot but I cannot cook it. "
                + "\nCan you bring me something I can cook it in? I am STARVING! pot", "C2");
        scene[SceneType.caveB.ordinal()] = caveB;
        
        Scene caveC = new Scene("\n               Cave C\n"
                + "----------------------------------------------"
                + "\nCurly: I want a snack. Something sweet." + MysticWater.getCurrentGame().getPlayer().getName() + ", Give me something "
                + "\nsweet or I might just eat YOU!!! MWAUAHAHA just Kidding! "
                + "\nI do want a snack though. Candy", "C3");
        scene[SceneType.caveC.ordinal()] = caveC;
        
        Scene caveD = new Scene("\n               Cave D\n"
                + "----------------------------------------------"
                + "\nPeter Pan: " + MysticWater.getCurrentGame().getPlayer().getName() + "! I cannot find Tinkerbell and I can't fly "
                + "\nbecause I am ut of pixie dust! Can you bring me "
                + "\nsomething to help me fly again? I am worried about "
                + "\nTinkerbell! She never leaves me. FlyingShoes, Jetpack ", "C4");
        scene[SceneType.caveD.ordinal()] = caveD;
        
        Scene caveE = new Scene("\n               Cave E\n"
                + "----------------------------------------------"
                + "\nCave Fairy: Hello " + MysticWater.getCurrentGame().getPlayer().getName()
                + "! To move forward "
                + "\nin your joueney you must prove your knowledge. "
                + "\nAnswer this puzzle as many times as you like "
                + "\nand recieve a reward for a correct answer.", "C5");
        scene[SceneType.caveE.ordinal()] = caveE;
        
        //beach (11-15)
        Scene beachA = new Scene("\n              Beach A\n"
                + "----------------------------------------------"
                + "\nWendy: Oh it's just you " + MysticWater.getCurrentGame().getPlayer().getName() + ". I am trying to fly but I can not remember what I need. "
                + "\nIt is faith, trust and what? I can't remember! Can you bring "
                + "\nme the last thing I need to fly? Pixie Dust", "B1");
        scene[SceneType.beachA.ordinal()] = beachA;
        
        Scene beachB = new Scene("\n              Beach B\n"
                + "----------------------------------------------"
                + "\nMermaid: I am starving! I haven't caught any fish all day! "
                + "\n" + MysticWater.getCurrentGame().getPlayer().getName() + ", please bring me something to eat. I am a carnivore by the way... Hunk of Meat", "B2");
        scene[SceneType.beachB.ordinal()] = beachB;
        
        Scene beachC = new Scene("\n              Beach C\n"
                + "----------------------------------------------"
                + "\nSmee: My boat sank and now I cannot get back to the "
                + "\npirate ship. Can you help me, " + MysticWater.getCurrentGame().getPlayer().getName() + "? I need something that "
                + "\ncan float and I can use to swim out to the pirate ship. Surfboard", "B3");
        scene[SceneType.beachC.ordinal()] = beachC;
        
        Scene beachD = new Scene("              Beach D\n"
                + "----------------------------------------------"
                + "\nHook: Who are you?! " + MysticWater.getCurrentGame().getPlayer().getName() + "... I do not know that name "
                + "\nand I do not like strangers. Bring me a "
                + "\npiece of treasure and I won't kill you. HolyGrail", "B4");
        scene[SceneType.beachD.ordinal()] = beachD;
        
        Scene beachE = new Scene("\n              Beach E\n"
                + "----------------------------------------------"
                + "\nWater Fairy: Hello " + MysticWater.getCurrentGame().getPlayer().getName()
                + "! To move forward "
                + "\nin your joueney you must prove your knowledge. "
                + "\nAnswer this puzzle as many times as you like "
                + "\nand recieve a reward for a correct answer.", "B5");
        scene[SceneType.beachE.ordinal()] = beachE;
        
        //desert (16-20)
        Scene desertA = new Scene("\n             Desert A\n"
                + "----------------------------------------------"
                + "\nSandman: SO MOUCH SAND!! AM I IN HEAVEN! CAN YOU PLEASE! "
                + "\nBRING ME SOMETHNG THAT I CAN EAT ALL THIS DELICIOUS SAND "
                + "\nWITH? PLEASE! I AM BEGGING YOU! spork", "D1");
        scene[SceneType.desertA.ordinal()] = desertA;
        
        Scene desertB = new Scene("\n             Desert B\n"
                + "----------------------------------------------"
                + "\nJohn: HELP! I am stuck in the sand! Can you pull me out " + MysticWater.getCurrentGame().getPlayer().getName() + "? "
                + "\nGo find something to help pull me out! HURRY! rope ", "D2");
        scene[SceneType.desertB.ordinal()] = desertB;
        
        Scene desertC = new Scene("\n             Desert C\n"
                + "----------------------------------------------"
                + "\nMicheal: I buried my favorite geme here but the sand is "
                + "\ntoo hard to dig with my hands. Can you bring me something "
                + "\nto help dig it out? Thanks " + MysticWater.getCurrentGame().getPlayer().getName() + "! It means a lot. Shovel", "D3");
        scene[SceneType.desertC.ordinal()] = desertC;
        
        Scene desertD = new Scene("\n             Desert D\n"
                + "----------------------------------------------"
                + "\nThomas: *stomach growls* Oh no! I forgot to eat breakfast! "
                + "\nCan you bring me some breakfast? Please " + MysticWater.getCurrentGame().getPlayer().getName() + "! My mom is gonna be so mad. waffles", "D4");
        scene[SceneType.desertD.ordinal()] = desertD;
        
        Scene desertE = new Scene("\n             Desert E\n"
                + "----------------------------------------------"
                + "\nPrentiss: Hello " + MysticWater.getCurrentGame().getPlayer().getName()
                + "! To move forward "
                + "\nin your joueney you must prove your knowledge. "
                + "\nAnswer this puzzle as many times as you like "
                + "\nand recieve a reward for a correct answer.", "D5");
        scene[SceneType.desertE.ordinal()] = desertE;
        
        //mountains (21-25)
        Scene mountainsA = new Scene("\n              Mountains A\n"
                + "----------------------------------------------"
                + "\nTwins: We are lost. " + MysticWater.getCurrentGame().getPlayer().getName() + ", do you know which way is North? We can't "
                + "\nremember. Do you have something that will help us find our "
                + "\nway home? Compass", "M1");
        scene[SceneType.mountainsA.ordinal()] = mountainsA;
        
        Scene mountainsB = new Scene("\n              Mountains B\n"
                + "----------------------------------------------"
                + "\nPockets: You look really smart " + MysticWater.getCurrentGame().getPlayer().getName() + ". I saw you solve all those puzzles. "
                + "\nI wish I was as smart as you. I can't even do my math homework. "
                + "\nCan you bring me something to help me with my homework? Calculator", "M2");
        scene[SceneType.mountainsB.ordinal()] = mountainsB;
        
        Scene mountainsC = new Scene("\n              Mountains C\n"
                + "----------------------------------------------"
                + "\nAce: Be careful " + MysticWater.getCurrentGame().getPlayer().getName() + "! There is a moutain lion ahead! Bring me something to "
                + "\nfight it off and hurry! we don't have much time before it "
                + "\nsmells us and attacks! Sword", "M3");
        scene[SceneType.mountainsC.ordinal()] = mountainsC;
        
        Scene mountainsD = new Scene("\n              Mountains D\n"
                + "----------------------------------------------"
                + "\nThudbutt: This part of the mountain would be so fun to ride down. "
                + "\nDUDE! " + MysticWater.getCurrentGame().getPlayer().getName() + "! Bring me something I can ride down this moutain on! It will "
                + "\nbe so gnarly! Skateboard", "M4");
        scene[SceneType.mountainsD.ordinal()] = mountainsD;
        
        Scene finish = new Scene("\n              Finish\n"
                + "----------------------------------------------"
                + "\nDragon: I was expeting you, " + MysticWater.getCurrentGame().getPlayer().getName()
                + "! I am the guardian of the Mystic Water. "
                + "\nOnly the wisest and strongest can partake "
                + "\nof this mystical water. You have proven your "
                + "\nstrength with how far you have gotten but "
                + "\nnow you must prove that you are wise enough. "
                + "\nSolve this final Puzzle and I will give you "
                + "\na vessel of the Mystic Water.", "M5");
        scene[SceneType.finish.ordinal()] = finish;
        
        return scene;
    }
    
    public static void moveCharacter(int column, Player player) throws MapControlException {
        
        Map map = MysticWater.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        
        if (player == null) {
            throw new MapControlException("No player was passed.");
        }
        if (column + player.getLocation().getColumn() > 5 || column + player.getLocation().getColumn() < 0) {
            throw new MapControlException("Column selected exceeds boundary.");
        } 
        //add player column to input
        int newColumn = column + player.getLocation().getColumn();
        int playerRow = player.getLocation().getRow();
        MysticWater.getCurrentGame().getMap().getLocations();
        MysticWater.getPlayer().setLocation(locations[playerRow][newColumn]);
        locations[playerRow][newColumn].setVisited(true);
        MysticWater.getPlayer().getLocation();
}
}
