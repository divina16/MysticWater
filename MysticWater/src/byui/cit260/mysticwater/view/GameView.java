/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.GameControl;
import byui.cit260.mysticwater.exceptions.GameControlException;
import byui.cit260.mysticwater.model.Player;
import java.util.Scanner;

/**
 *
 * @author Nina Sanchez and Trent Buckner
 */
public class GameView extends View {
    
    private String playersName;

    public GameView() {
        super ("\n\n***************************************************************************"
 +  "\n*                              MYSTIC WATER                               *"
                        + "\n*  Once upon a time there was an old man whose wife was deathly ill.      *"
                        + "\n*  The doctors could not figure out what was wrong or how to cure         *"
                        + "\n*  her. An old witch told him the legend of the mystic water. This water  *"
                        + "\n*  was found at the top of the creepy mountain. He had no other           *"
                        + "\n*  option than to seek after this mystic water in order to save his       *"
                        + "\n*  beloved. He must travel across Neverland in order to get to the        *"
                        + "\n*  creepy mountain. It will take strength, courage and the help of the    *"
                        + "\n*  lost boys in order to help him on his quest. There will be             *"
                        + "\n*  pirates, sirens, and dragons that he will encounter on his journey     *"
                        + "\n*  to the creepy mountain.                                                *"
                        + "\n\n***************************************************************************");
    }
    
    public void game() {
       
        //Display the banner screen
        this.displayView();
        
        //Create and save the player object
        Player playerOne = null;

        playerOne = GameControl.createNewPlayer(playersName);
        
        //Display a personalized welcome message
        this.displayWelcomeMessage(playerOne);
        
        //Display the Main Menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayView();
        
    }

    @Override
    public String getInput() throws GameControlException{
       String name = null;
       Scanner keyboard = new Scanner(System.in);
          
           System.out.println("Enter the player's name below:");
           
           name = keyboard.nextLine();
           name = name.trim();
           
           if (name == null) {
               throw new GameControlException("Name can't be null");
           }
           
           if (name.length() < 2) {
               throw new GameControlException("Name must be longer than 2 characters");
           }
       
       return name;
    }

    private void displayWelcomeMessage(Player playerOne) {
        System.out.println("\n\n===============================================");
        System.out.println("\tWelcome to the game " + playerOne.getName());
        System.out.println("\tEnjoy the game and don't die!");
        System.out.println("\n\n===============================================");
    }

    @Override
    public boolean doAction(Object obj) {
        playersName = (String) obj;
        return true;
    }
}
