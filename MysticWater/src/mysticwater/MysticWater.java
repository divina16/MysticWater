/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysticwater;

import byui.cit260.mysticwater.model.Game;
import byui.cit260.mysticwater.model.Player;
import byui.cit260.mysticwater.view.GameView;

import java.io.Serializable;

/**
 *
 * @author Trent Buckner & Nina Sanchez
 */
public class MysticWater implements Serializable {
    
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {
        
        //start game view
        GameView gameView = new GameView();
        gameView.game();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MysticWater.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MysticWater.player = player;
    }
    
}

