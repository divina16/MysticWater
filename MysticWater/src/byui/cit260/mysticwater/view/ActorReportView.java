/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.GameControl;
import byui.cit260.mysticwater.model.Actors;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nina Sanchez
 */
public class ActorReportView extends View{

    public ActorReportView(String promptMessage) {
        super("\nPlease enter the name you would like to save your report to.");
    }


    

    @Override
    public boolean doAction(Object obj) {
        String filePath = (String) obj;
        
        Actors[] actor =  GameControl.getSortedActorList();
     
    try (PrintWriter out = new PrintWriter(filePath)){
        
        out.printf("\n\n            List of Actors");
        out.printf("%n%-20s%10s", "Description", "Coordinates");
        out.printf("%n%-20s%10s", "-----------", "-----------");
        
        for (Actors nextActor : actor){
             out.printf("%n%-20s%10s", nextActor.getDescription(), nextActor.getCoordinates());
        }
    }   catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "I/O Error: " + ex.getMessage());
            return false;
        }
    this.console.println("Report was printed.");
    return true;
    }
    
}
