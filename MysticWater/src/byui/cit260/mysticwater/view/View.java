/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = MysticWater.getInFile();
    protected final PrintWriter console = MysticWater.getOutFile();
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void displayView() {
        String selection;
        boolean done = false;
        
        do {
            this.console.println(this.promptMessage);
            selection = this.getInput();
            done = this.doAction(selection);
            
        } while (!done);
    }
    
    @Override
    public String getInput(){
       boolean valid = false;
       String menuRequest = null;
       
    try {
       while (!valid) {
           
           menuRequest = keyboard.readLine();
           menuRequest = menuRequest.trim();
           
           if (menuRequest.length() < 1) {
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
    
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
}
