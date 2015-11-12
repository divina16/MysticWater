/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import java.util.Scanner;

/**
 *
 * @author Trent Buckner
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void displayView() {
        String selection = "";
        boolean done = false;
        
        do {
            System.out.println(this.promptMessage);
            selection = this.getInput();
            
            done = this.doAction(selection);
            
        } while (!done);
    }
    
    @Override
    public String getInput() {
       boolean valid = false;
       String menuRequest = null;
       Scanner keyboard = new Scanner(System.in);
       
       while (!valid) {
           
           menuRequest = keyboard.nextLine();
           menuRequest = menuRequest.trim();
           
           if (menuRequest.length() == 0) {
               System.out.println("Invalid input - the value must not be blank");
               continue;
           }
           break;
       }
       return menuRequest;
    }   
}
