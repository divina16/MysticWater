/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;
import byui.cit260.mysticwater.model.Actors;
import byui.cit260.mysticwater.model.Actors.Actor;
import byui.cit260.mysticwater.model.Game;
import byui.cit260.mysticwater.model.InventoryItem;
import byui.cit260.mysticwater.model.InventoryItem.Item;
import byui.cit260.mysticwater.model.Map;
import byui.cit260.mysticwater.model.Player;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class GameControl {

    public static Player createNewPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        
        Player playerOne = new Player();
        playerOne.setName(playersName);
        
        MysticWater.setPlayer(playerOne);
        
        System.out.println("\n**** createNewPlayer function was called ****");
        return playerOne;
    }

    public static void createNewGame(Player player) {
        System.out.println("createNewGame function in GameControl class was called");
        
        Game game = new Game();//create new game
        MysticWater.setCurrentGame(game);//save in MysticWater
        
        game.setPlayer(player);
        
        InventoryItem[] inventory = GameControl.createInventory();
        game.setInventory(inventory);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
    }
    
    public static InventoryItem[] createInventory() {
        System.out.println("createInventory() in GameControl was called");
        
        InventoryItem[] inventory = new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        //1
        InventoryItem rope = new InventoryItem(0.25);
        rope.setDescription("Rope");
        rope.setQuantity(0);
        rope.setPrice(50);
        inventory[Item.rope.ordinal()] = rope;
        
        //2
        InventoryItem jetpack = new InventoryItem(0.6);
        jetpack.setDescription("Jetpack");
        jetpack.setQuantity(0);
        rope.setPrice(200);
        inventory[Item.jetpack.ordinal()] = jetpack;
        
        //3
        InventoryItem axe = new InventoryItem(0.6);
        axe.setDescription("Axe");
        axe.setQuantity(0);
        rope.setPrice(30);
        inventory[Item.axe.ordinal()] = axe;
        
        //4
        InventoryItem umbrella = new InventoryItem(0.6);
        umbrella.setDescription("Umbrella");
        umbrella.setQuantity(0);
        rope.setPrice(30);
        inventory[Item.umbrella.ordinal()] = umbrella;
        
        //5
        InventoryItem pixieDust = new InventoryItem(0.6);
        pixieDust.setDescription("Pixie Dust");
        pixieDust.setQuantity(0);
        rope.setPrice(250);
        inventory[Item.pixieDust.ordinal()] = pixieDust;
        
        //6
        InventoryItem wrench = new InventoryItem(0.6);
        wrench.setDescription("Wrench");
        wrench.setQuantity(0);
        rope.setPrice(50);
        inventory[Item.wrench.ordinal()] = wrench;
        
        //7
        InventoryItem flyingShoes = new InventoryItem(0.6);
        flyingShoes.setDescription("Flying Shoes");
        flyingShoes.setQuantity(0);
        rope.setPrice(200);
        inventory[Item.flyingShoes.ordinal()] = flyingShoes;
        
        //8
        InventoryItem ladder = new InventoryItem(0.6);
        ladder.setDescription("Ladder");
        ladder.setQuantity(0);
        rope.setPrice(80);
        inventory[Item.ladder.ordinal()] = ladder;
        
        //9
        InventoryItem pole = new InventoryItem(0.6);
        pole.setDescription("Pole");
        pole.setQuantity(0);
        rope.setPrice(30);
        inventory[Item.pole.ordinal()] = pole;
        
        //10
        InventoryItem sword = new InventoryItem(0.6);
        sword.setDescription("Sword");
        sword.setQuantity(0);
        rope.setPrice(100);
        inventory[Item.sword.ordinal()] = sword;
        
        //11
        InventoryItem candy = new InventoryItem(0.6);
        candy.setDescription("Candy");
        candy.setQuantity(0);
        rope.setPrice(10);
        inventory[Item.candy.ordinal()] = candy;
        
        //12
        InventoryItem spork = new InventoryItem(0.6);
        spork.setDescription("Spork");
        spork.setQuantity(0);
        rope.setPrice(10);
        inventory[Item.spork.ordinal()] = spork;
        
        //13
        InventoryItem shovel = new InventoryItem(0.6);
        shovel.setDescription("Shovel");
        shovel.setQuantity(0);
        rope.setPrice(50);
        inventory[Item.shovel.ordinal()] = shovel;
        
        //14
        InventoryItem rubberChicken = new InventoryItem(0.6);
        rubberChicken.setDescription("Rubber Chicken");
        rubberChicken.setQuantity(0);
        rope.setPrice(30);
        inventory[Item.rubberChicken.ordinal()] = rubberChicken;
        
        //15
        InventoryItem pulley = new InventoryItem(0.6);
        pulley.setDescription("Pulley");
        pulley.setQuantity(0);
        rope.setPrice(50);
        inventory[Item.pulley.ordinal()] = pulley;
        
        //16
        InventoryItem skateboard = new InventoryItem(0.6);
        skateboard.setDescription("Skateboard");
        skateboard.setQuantity(0);
        rope.setPrice(75);
        inventory[Item.skateboard.ordinal()] = skateboard;
        
        //17
        InventoryItem surfboard = new InventoryItem(0.6);
        surfboard.setDescription("Surfboard");
        surfboard.setQuantity(0);
        rope.setPrice(75);
        inventory[Item.surfboard.ordinal()] = surfboard;
        
        //18
        InventoryItem waffles = new InventoryItem(0.6);
        waffles.setDescription("Waffles");
        waffles.setQuantity(0);
        rope.setPrice(20);
        inventory[Item.waffles.ordinal()] = waffles;
        
        //19
        InventoryItem calculator = new InventoryItem(0.6);
        calculator.setDescription("Surfboard");
        calculator.setQuantity(0);
        rope.setPrice(100);
        inventory[Item.calculator.ordinal()] = calculator;
        
        //20
        InventoryItem holyGrail = new InventoryItem(0.6);
        holyGrail.setDescription("Holy Grail");
        holyGrail.setQuantity(0);
        rope.setPrice(250);
        inventory[Item.holyGrail.ordinal()] = holyGrail;
        
        //21
        InventoryItem jackHammer = new InventoryItem(0.6);
        jackHammer.setDescription("Jack Hammer");
        jackHammer.setQuantity(0);
        rope.setPrice(100);
        inventory[Item.jackHammer.ordinal()] = jackHammer;
        
        //22
        InventoryItem compass = new InventoryItem(0.6);
        compass.setDescription("Compass");
        compass.setQuantity(0);
        rope.setPrice(100);
        inventory[Item.compass.ordinal()] = compass;
        
        //23
        InventoryItem pot = new InventoryItem(0.6);
        pot.setDescription("Pot");
        pot.setQuantity(0);
        rope.setPrice(50);
        inventory[Item.pot.ordinal()] = pot;
           
        //24
        InventoryItem hunkOfMeat = new InventoryItem(0.6);
        hunkOfMeat.setDescription("Hunk of Meat");
        hunkOfMeat.setQuantity(0);
        rope.setPrice(40);
        inventory[Item.hunkOfMeat.ordinal()] = hunkOfMeat;
        
        return inventory;
    }
    
    public static InventoryItem[] getSortedInventoryList() {
        
        System.out.println("getSortedInventoryList function was called");
        
        InventoryItem[] originalInventory = 
                MysticWater.getCurrentGame().getInventory();
        
        InventoryItem[] inventory = originalInventory.clone();
        
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventory.length-1; i++) {
            for(int j = 0; j < inventory.length-1-i; j++) {
                if (inventory[j].getDescription().
                        compareToIgnoreCase(inventory[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventory[j];
                    inventory[j] = inventory[j+1];
                    inventory[j+1] = tempInventoryItem;
                }
            }
        }
        
        return inventory;
    }
    
    public static Actors[] createActorList() {
        System.out.println("createActorList() in GameControl was called");
        
        Actors[] actorList = new Actors[Constants.NUMBER_OF_ACTORS];
        
        //1
        Actors golem = new Actors();
        golem.setDescription("Golem");
        golem.setCoordinates(0.0);
        actorList[Actor.golem.ordinal()] = golem;
        
        //2
        Actors dragon = new Actors();
        dragon.setDescription("Dragon");
        dragon.setCoordinates(0.0);
        actorList[Actor.dragon.ordinal()] = dragon;
        
        //3
        Actors siren = new Actors();
        siren.setDescription("Siren");
        siren.setCoordinates(0.0);
        actorList[Actor.siren.ordinal()] = siren;
        
        //4
        Actors mermaid = new Actors();
        mermaid.setDescription("Mermaid");
        mermaid.setCoordinates(0.0);
        actorList[Actor.mermaid.ordinal()] = mermaid;
        
        //5
        Actors sandman = new Actors();
        sandman.setDescription("Sandman");
        sandman.setCoordinates(0.0);
        actorList[Actor.sandman.ordinal()] = sandman;
        
        //6
        Actors waterFairy = new Actors();
        waterFairy.setDescription("Water Fairy");
        waterFairy.setCoordinates(0.0);
        actorList[Actor.waterFairy.ordinal()] = waterFairy;
        
        //7
        Actors tootles = new Actors();
        tootles.setDescription("Tootles");
        tootles.setCoordinates(0.0);
        actorList[Actor.tootles.ordinal()] = tootles;
        
        //8
        Actors nibs = new Actors();
        nibs.setDescription("Nibs");
        nibs.setCoordinates(0.0);
        actorList[Actor.nibs.ordinal()] = nibs;
        
        //9
        Actors slightly = new Actors();
        slightly.setDescription("Slightly");
        slightly.setCoordinates(0.0);
        actorList[Actor.slightly.ordinal()] = slightly;
        
        //10
        Actors curly = new Actors();
        curly.setDescription("Curly");
        curly.setCoordinates(0.0);
        actorList[Actor.curly.ordinal()] = curly;
        
        //11
        Actors peterPan = new Actors();
        peterPan.setDescription("Peter Pan");
        peterPan.setCoordinates(0.0);
        actorList[Actor.peterPan.ordinal()] = peterPan;
        
        //12
        Actors twins = new Actors();
        twins.setDescription("Twins");
        twins.setCoordinates(0.0);
        actorList[Actor.twins.ordinal()] = twins;
        
        //13
        Actors hook = new Actors();
        hook.setDescription("Hook");
        hook.setCoordinates(0.0);
        actorList[Actor.hook.ordinal()] = hook;
        
        //14
        Actors smee = new Actors();
        smee.setDescription("Smee");
        smee.setCoordinates(0.0);
        actorList[Actor.smee.ordinal()] = smee;
        
        //15
        Actors tinkerbell = new Actors();
        tinkerbell.setDescription("Tinkerbell");
        tinkerbell.setCoordinates(0.0);
        actorList[Actor.tinkerbell.ordinal()] = tinkerbell;
        
        //16
        Actors forestFairy = new Actors();
        forestFairy.setDescription("Forest Fairy");
        forestFairy.setCoordinates(0.0);
        actorList[Actor.forestFairy.ordinal()] = forestFairy;
        
        //17
        Actors caveFairy = new Actors();
        caveFairy.setDescription("Cave Fairy");
        caveFairy.setCoordinates(0.0);
        actorList[Actor.caveFairy.ordinal()] = caveFairy;
        
        //18
        Actors wendy = new Actors();
        wendy.setDescription("Wendy");
        wendy.setCoordinates(0.0);
        actorList[Actor.wendy.ordinal()] = wendy;
        
        //19
        Actors john = new Actors();
        john.setDescription("John");
        john.setCoordinates(0.0);
        actorList[Actor.john.ordinal()] = john;
        
        //20
        Actors micheal = new Actors();
        micheal.setDescription("Micheal");
        micheal.setCoordinates(0.0);
        actorList[Actor.micheal.ordinal()] = micheal;
        
        //21
        Actors ted = new Actors();
        ted.setDescription("Ted");
        ted.setCoordinates(0.0);
        actorList[Actor.ted.ordinal()] = ted;
        
        //22
        Actors thomas = new Actors();
        thomas.setDescription("Thomas");
        thomas.setCoordinates(0.0);
        actorList[Actor.thomas.ordinal()] = thomas;
        
        //23
        Actors prentiss = new Actors();
        prentiss.setDescription("Prentiss");
        prentiss.setCoordinates(0.0);
        actorList[Actor.prentiss.ordinal()] = prentiss;
        
        //24
        Actors pockets = new Actors();
        pockets.setDescription("Pockets");
        pockets.setCoordinates(0.0);
        actorList[Actor.pockets.ordinal()] = pockets;
        
        //25
        Actors ace = new Actors();
        ace.setDescription("Ace");
        ace.setCoordinates(0.0);
        actorList[Actor.ace.ordinal()] = ace;
        
        //26
        Actors thudButt = new Actors();
        thudButt.setDescription("Thudbutt");
        thudButt.setCoordinates(0.0);
        actorList[Actor.thudButt.ordinal()] = thudButt;
        
        return actorList;
    }
    
    public static Actors[] getSortedActorList() {
        
        System.out.println("getSortedActorList function was called");
        
        Actors[] originalActorList = 
                MysticWater.getCurrentGame().getActors();
        
        Actors[] actorList = originalActorList.clone();
        
        Actors tempActorList;
        for (int i = 0; i <actorList.length-1; i++) {
            for(int j = 0; j < actorList.length-1-i; j++) {
                if (actorList[j].getDescription().
                        compareToIgnoreCase(actorList[j + 1].getDescription()) > 0) {
                    tempActorList = actorList[j];
                    actorList[j] = actorList[j+1];
                    actorList[j+1] = tempActorList;
                }
            }
        }
        
        return actorList;
    }
    
    public static void loadGame() {
        System.out.println("loadGame function in GameControl class was called");
    }

    public static void helpMenu() {
        System.out.println("helpMenu function in GameControl class was called");
    }

    public static void quitGame() {
        System.exit(0);
    }

}
