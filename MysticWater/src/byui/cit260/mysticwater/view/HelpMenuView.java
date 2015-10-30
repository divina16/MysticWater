/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;
import java.util.Scanner;
/**
 *
 * @author Trent Buckner and Nina Sanchez
 */
public class HelpMenuView {
    static HelpMenuView helpMenu;
    
    private final String HELP = "\n"
            + "\n============================================"
            + "\n               Help Menu Options            "
            + "\n============================================"
            + "\nM - Moving to a Location."
            + "\nU - Using an Item."
            + "\nP - Purchasing an Item."
            + "\nI - Interacting with Characters."
            + "\nG - Goal of the Game."
            + "\nB - Back to Start Menu"
            + "\n============================================";
    
    public void displayHelpMenu() {
        char selection = ' ';
        do {
            System.out.println(HELP);
            
            String input = this.helpRequest();
            selection = input.charAt(0);
            
            this.doHelpSelection(selection);
            
        } while (selection != 'B');
    }
    
    private String helpRequest() {
       boolean valid = false;
       String helpRequest = null;
       Scanner keyboard = new Scanner(System.in);
       
       while (!valid) {
          
           System.out.println("Select an option by entering the corresponding letter:");
           
           helpRequest = keyboard.nextLine();
           helpRequest = helpRequest.trim();
           
           if (helpRequest.length() == 0) {
               System.out.println("Invalid input - the value must not be blank");
               continue;
           }
           break;
       }
       return helpRequest;
    }

    private void doHelpSelection(char selection) {
        
        switch (selection) {
            case 'M':
                this.moveHelp();
                break;
            case 'U':
                this.useItemHelp();
                break;
            case 'P':
                this.purchaseItemHelp();
                break;
            case 'I':
                this.interactHelp();
                break;
            case 'G':
                this.goalHelp();
                break;
            case 'B':
                this.backToStart();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                       
        }
    }
    
    private void moveHelp() {
        System.out.println("You must open the Game Menu. "
                + "\nInput the corresponding letter for Move Location. "
                + "\nThen looking at the map, input the corresponding number "
                + "\nfor the location you would like to move.");
    }

    private void useItemHelp() {
        System.out.println("You must open the Game Menu. "
                + "\nInput the corresponding letter for Inventory. "
                + "\nThen looking at your inventory, input the corresponding "
                + "\nletter for the item you would like to use. Then select Use Item. ");
    }

    private void purchaseItemHelp() {
      System.out.println("While in the Shop Menu, input the corresponding letter "
                + "\nfor the item you would like to purchase and select Purchase Item.");  
    }

    private void interactHelp() {
        System.out.println("After moving to a location, the scene description "
                + "\nis displayed along with options to speak to the "
                + "\ncharacters in the area. Select the corresponding "
                + "\nletter for the character you would like to speak to.");
    }
    
    private void goalHelp() {
        System.out.println("You, the old man, must travel up the mountain "
                + "\nand overcome each obstacle by obtaining special "
                + "\nitems. Each item can only be obtained by solving "
                + "\npuzzles and answering riddles given by the characters "
                + "\nyou encounter along the way. For example: you may "
                + "\nneed a way to jump across a ledge. You must talk to "
                + "\nthe characters in the area and find the appropriate "
                + "\nitem. It may be a jetpack or magical flying shoes. "
                + "\nYou may have to answer several riddles before finding "
                + "\nthe item you need. If the wrong item is used, it may "
                + "\nhave severe consequences, such as a game over, and the "
                + "\nplayer will have to start over. The player also "
                + "\nreceives a small amount of money for each challenge "
                + "\nthat is completed which can be used to buy items at "
                + "\nstores rather than answering riddles.");
    }
    
    private void backToStart() {
        System.out.println("backToStart function was called");
    }
    
}
