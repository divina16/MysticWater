/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.MapControl;
import byui.cit260.mysticwater.exceptions.MapControlException;
import byui.cit260.mysticwater.model.Player;
import mysticwater.MysticWater;

/**
 *
 * @author Nina Sanchez
 */
public class MoveCharacterView extends View {
    
    static MoveCharacterView move;
    
     public MoveCharacterView() {
         super("");
         String menu;
         
       menu = "\n"
            + "\n------------------------------------"
            + "\n|Where would you like to travel to?|"
            + "\n------------------------------------";
       
       int selection = 0;
        
        do {
            this.console.println("\nPlease enter number of spaces you want to move forward:"
                    + "...or press E to exit");
                    
            String input = this.getInput();
        try {
            selection = Integer.parseInt(input);
        }
        catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid column number");
        }
            this.doAction(selection);
        } 
        while (selection != ' ');
    }    
     
     @Override
     public String getInput() {
        boolean valid = false;
       String menuRequest = null;
    
    try {
       while (!valid) {
           
           menuRequest = keyboard.readLine();
           menuRequest = menuRequest.trim();
           
           if (menuRequest.length() == 0) {
               ErrorView.display(this.getClass().getName(), "Invalid input - the value must not be blank");
               continue;
           }
           break;
       }
    } catch (Exception e) {
        ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
    }
       return menuRequest;
    }
     
    @Override
    public boolean doAction(Object selection) {
        //get current column of current player location
        int currentColumn = MysticWater.getPlayer().getLocation().getColumn();
        //call mapControl
        //print new scene description
        return true;
    }       
}

