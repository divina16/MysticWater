/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysticwater;

import byui.cit260.mysticwater.model.Game;
import byui.cit260.mysticwater.model.Player;
import byui.cit260.mysticwater.view.GameView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.io.Serializable;

/**
 *
 * @author Trent Buckner & Nina Sanchez
 */
public class MysticWater implements Serializable {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static void main(String[] args) {
        
    try {
        
       MysticWater.inFile = new BufferedReader(new InputStreamReader(System.in));
       MysticWater.outFile = new PrintWriter(System.out, true);
       
    try{
       //open log file
       String filePath = "log.txt";
       MysticWater.logFile = new PrintWriter(filePath);
    } catch (Exception e) {
        System.out.println("Exception: " + e.toString() +
                           "\nCause: " + e.getCause() +
                           "\nMessage: " + e.getMessage());
    }
       
        //start game view
        GameView gameView = new GameView();
        gameView.displayView();
        return;

    } catch (Throwable e) {
        System.out.println("Exception: " + e.toString() +
                           "\nCause: " + e.getCause() +
                           "\nMessage: " + e.getMessage());
        
        e.printStackTrace();
        
    } finally {
            try {
                if (MysticWater.inFile != null)
                    MysticWater.inFile.close();
                
                if (MysticWater.outFile != null)
                    MysticWater.outFile.close();
                
                if (MysticWater.logFile != null) {
                    MysticWater.logFile.flush();
                    MysticWater.logFile.close(); 
                }
                    
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
    }
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
    
        public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MysticWater.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MysticWater.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MysticWater.inFile = inFile;
    }
    
}

