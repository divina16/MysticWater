/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.exceptions.GameControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
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
            try {
                selection = this.getInput();
            }
            catch (GameControlException error){
                System.out.println(error.getMessage());
                continue;
            }
            
            done = this.doAction(selection);
            
        } while (!done);
    }
    
    @Override
    public String getInput() throws GameControlException{
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
