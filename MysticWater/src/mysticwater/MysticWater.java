/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysticwater;

import byui.cit260.mysticwater.model.Actor;
import byui.cit260.mysticwater.model.Game;
import byui.cit260.mysticwater.model.Item;
import byui.cit260.mysticwater.model.ItemList;
import byui.cit260.mysticwater.model.Location;
import byui.cit260.mysticwater.model.Map;
import byui.cit260.mysticwater.model.Player;
import byui.cit260.mysticwater.model.Scene;
import byui.cit260.mysticwater.model.ShopList;

import java.io.Serializable;

/**
 *
 * @author Trent Buckner & Nina Sanchez
 */
public class MysticWater implements Serializable {

    public static void main(String[] args) {
        
        //Player
        Player playerOne = new Player();
        
        playerOne.setName("Old Man");
        playerOne.setplayerTime(System.currentTimeMillis());
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //ItemList
        ItemList inventory = new ItemList();
        
        inventory.setitemName("You have no items!");
        inventory.setsuccessRate("N/A");
        
        String itemListInfo = inventory.toString();
        System.out.println(itemListInfo);
        
        //Item_rope
        Item rope = new Item();
        
        rope.setItemUsed("You have no rope in your inventory.");
        rope.setSuccessRate("1-10");
        
        String itemInfo = rope.toString();
        System.out.println(itemInfo);
        
        //ShopList_joeShop
        ShopList joeShop = new ShopList();
        
        joeShop.setShopList("What would you like to buy? "
                + "1. Rope. 2. Jetpack. 3. Grapple Hook.");
        joeShop.setItemPrice("Rope = $20: Jetpack = $100: "
                + "Grapple Hook = $30");
        joeShop.setSuccessRate("Rope = 1-10: Jetpack = 1-3: "
                + "Grapple Hook = 1-6");
        joeShop.setItemSold("N/A");
        
        String shopListInfo = joeShop.toString();
        System.out.println(shopListInfo);
        
        //Actor_Bob
        Actor actorOne = new Actor();
        
        actorOne.setActorName("Bob");
        actorOne.setActorLocation(6);
        actorOne.setAnswerRiddle("I have beaches with no sand, oceans with no water, "
                + "and cities with no people. What am I?");
        actorOne.setRiddleSolved("A Map");
        actorOne.setActorInventory("Rope");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        //Location
        Location locationOne = new Location();
        
        locationOne.setRow(1);
        locationOne.setColumn(1);
        locationOne.setVisited("Yes");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        //Scene
        Scene shopOne = new Scene();
        
        shopOne.setTitle("Joe's Shop");
        shopOne.setDescription("This is Joe's Shop. You can buy itms here to help you along your journey!");
        
        String sceneInfo = shopOne.toString();
        System.out.println(sceneInfo);
        
        //Map
        Map map = new Map();
        
        map.setNoColumns(5);
        map.setNoRows(5);
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
        //Game
        Game game = new Game();
        
        game.setName("Game 1");
        game.setStartTime(System.currentTimeMillis());
        
        String gameInfo = game.toString();
        System.out.println(gameInfo);
    }
    
}

