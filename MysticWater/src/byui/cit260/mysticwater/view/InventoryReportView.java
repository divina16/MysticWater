/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.GameControl;
import byui.cit260.mysticwater.model.InventoryItem;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Trent Buckner
 */
public class InventoryReportView extends View{

    public InventoryReportView(String promptMessage) {
        super("\n\nEnter the file path for file where the report"
                + " is to be saved.");
    }

    @Override
    public boolean doAction(Object obj) {
        String outputLocation = (String) obj;
        
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
    try (PrintWriter out = new PrintWriter(outputLocation)) {
        
        out.printf("\n\n            Inventory Report            ");
        out.printf("%n%-20s%10s%10s", "Description", "Quantity", "Price");
        out.printf("%n%-20s%10s%10s", "-----------", "--------", "-----");
        
        for (InventoryItem nextInventoryItem : inventory) {
            out.printf("%n%-20s%10s%10s", nextInventoryItem.getDescription(), nextInventoryItem.getSuccessRate(), nextInventoryItem.getPrice());   
        }
    }   catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "I/O Error: " + ex.getMessage());
            return false;
        }
    this.console.println("Report was printed successfully.");
    return true;
    }
    
}
