/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import java.io.PrintWriter;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = MysticWater.getOutFile();
    private static final PrintWriter logFile = MysticWater.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
            "-----------------------------------------------"
          + "\n- ERROR - " + errorMessage
          + "\n---------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
