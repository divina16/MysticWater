/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;
import byui.cit260.mysticwater.model.Player;
import byui.cit260.mysticwater.model.Scene;
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
    }

    public static void loadGame(Player player) {
        System.out.println("loadGame function in GameControl class was called");
    }

    public static void helpMenu(Player player) {
        
        Scene help = new Scene();
        
        System.out.println("helpMenu function in GameControl class was called");
    }

    public static void quitGame(Player player) {
        System.exit(0);
    }
}
