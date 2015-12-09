/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.MoveCharacterControl;
import static byui.cit260.mysticwater.control.MoveCharacterControl.moveCharacter;
import byui.cit260.mysticwater.exceptions.MoveCharacterException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            this.console.println("Please enter the column number you want to move to:");
                    
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
        String selection = null;
           
        try {
            
           while (!valid) {
           
           selection = keyboard.readLine();
           selection = selection.trim();
           
           if (selection.length() < 1) {
               ErrorView.display(this.getClass().getName(), "You must enter a valid column.");
               continue;
           }
           break;
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
       return selection;
    }
     
    @Override
    public boolean doAction(Object obj) {
            MoveCharacterControl.moveCharacter();
            return true;
    }       
}

