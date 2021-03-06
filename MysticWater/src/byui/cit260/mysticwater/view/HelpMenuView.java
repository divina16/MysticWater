/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

/**
 *
 * @author Trent Buckner and Nina Sanchez
 */
public class HelpMenuView extends View {
    static HelpMenuView helpMenu;
    
    public HelpMenuView() {
    
        super("\n"
            + "\n============================================"
            + "\n               Help Menu Options            "
            + "\n============================================"
            + "\nM - Moving to a Location."
            + "\nU - Using an Item."
            + "\nP - Purchasing an Item."
            + "\nI - Interacting with Characters."
            + "\nG - Goal of the Game."
            + "\nE - Exit"
            + "\n============================================");
}

    @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        
        switch (selection) {
            case "M":
                this.moveHelp();
                break;
            case "U":
                this.useItemHelp();
                break;
            case "P":
                this.purchaseItemHelp();
                break;
            case "I":
                this.interactHelp();
                break;
            case "G":
                this.goalHelp();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
                       
        }
        return false;
    }
    
    private void moveHelp() {
        this.console.println("You must open the Game Menu. "
                + "\nInput the corresponding letter for Move Location. "
                + "\nThen looking at the map, input the corresponding number "
                + "\nfor the location you would like to move. "
                + "\nYou cannot move to a new location until you solve the puzzle "
                + "\nin that location or help the character. If you want to move "
                + "\nbackwards, input a negative number.");
    }

    private void useItemHelp() {
        this.console.println("You must open the Game Menu. "
                + "\nInput the corresponding letter for Inventory. "
                + "\nThen looking at your inventory, input the corresponding "
                + "\nletter for the item you would like to use. Then select Use Item. ");
    }

    private void purchaseItemHelp() {
      this.console.println("While in the Shop Menu, input the corresponding letter "
                + "\nfor the item you would like to purchase and select Purchase Item.");  
    }

    private void interactHelp() {
        this.console.println("After moving to a location, the scene description "
                + "\nis displayed describing the task that must be accomplished"
                + "\nin that location. "
                + "\nFor each location, you must either solve a puzzle, "
                + "\nor a character will ask you for help and you must"
                + "\ngive him the item he needs. You cannot move to a new "
                + "\narea until the puzzle is solved or the character has "
                + "\nbeen helped. If you run out of money, you may return "
                + "\nto previous puzzles and do them again. Every time you "
                + "\nsolve a puzzle, you will gain money as a reward.");
    }
    
    private void goalHelp() {
        this.console.println("You, the old man, must travel up the mountain "
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
}
