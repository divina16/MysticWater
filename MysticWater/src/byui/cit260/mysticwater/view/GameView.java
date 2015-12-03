/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.GameControl;
import byui.cit260.mysticwater.model.Player;

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

    @Override
    public String getInput() {
        boolean valid = false;
        String name = null;
          
           this.console.println("Enter the player's name below:");
           
        try {
            
           while (!valid) {
           
           name = keyboard.readLine();
           name = name.trim();
           
           if (name.length() < 2) {
               ErrorView.display(this.getClass().getName(), "You must enter a valid name.");
               continue;
           }
           break;
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
       return name;
    }

    private void displayWelcomeMessage(Player playerOne) {
        this.console.println("\n\n===============================================");
        this.console.println("\tWelcome to the game " + playerOne.getName());
        this.console.println("\tEnjoy the game and don't die!");
        this.console.println("\n\n===============================================");
    }

    @Override
    public boolean doAction(Object obj) {
        playersName = (String) obj;
        Player player = GameControl.createNewPlayer(playersName);
        this.displayWelcomeMessage(player);
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayView();
        return true;
    }
}
