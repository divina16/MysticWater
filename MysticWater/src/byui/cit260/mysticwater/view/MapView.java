/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.MapControl;
import byui.cit260.mysticwater.exceptions.MapControlException;
import byui.cit260.mysticwater.model.Map;
import mysticwater.MysticWater;

/**
 *
 * @author Nina Sanchez
 */
public class MapView extends View {

    static MapView map;
    
    public MapView() {
        super("");
        
        String menu;
        menu = "\n"
            + "\n-----------------------------------"
            + "\n|             Map Menu            |"
            + "\n-----------------------------------"
            + "\nM - Mountains"
            + "\nF - Forest"
            + "\nD - Desert"
            + "\nC - Caves"
            + "\nB - Beach";
             
            Map map = MysticWater.getCurrentGame().getMap();
            
            menu += "\n\n-----------Map Grid---------------"
                    + "\n\n";
            for (int rows = 0; rows < map.getNoRows(); rows++) {
                for (int columns = 0; columns < map.getNoColumns(); columns++){
                    menu += " | " + map.getLocations()[rows][columns].getScene().getMapSymbol();
                }
                menu += " |\n ---------------------\n";
            }
                
            menu += "\n-----------------------------------"
                    + "\nE - Exit Map"
            + "\n-----------------------------------";
            this.setPromptMessage(menu);
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        
        switch (selection) {
            case "M":
                this.mountains();
                break;
            case "F":
                this.forest();
                break;
            case "D":
                this.desert();
                break;
            case "C":
                this.cave();
                break;
            case "B":
                this.beach();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;       
        }
        return false;
}

    private void forest() {
        try {    
            MapControl.createMap();
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        this.console.println("\n                                \\   \\                                 "
                + "\n    /|\\                          \\   \\                          "
                + "\n   //|\\\\                /|\\       \\   \\                           "
                + "\n  ///|\\\\\\              //|\\\\       \\   \\"
                + "\n     |                ///|\\\\\\       \\   \\"
                + "\n     |                   |           \\   \\"
                + "\n                         |            ) E )        "
                + "\n                                     /   /        /|\\"
                + "\n         __________________________ /   /        //|\\\\"
                + "\n        / B _____________C__________D__/        ///|\\\\\\"
                + "\n       /   /                                       | "
                + "\n      ( A (                Fairy Forrest           |"
                + "\n       \\   \\");
    }

    private void mountains() {
        try {    
            MapControl.createMap();
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        this.console.println("   /\\     /\\       /\\ "
                + "\n  /  \\   /  \\/\\   /  \\"
                + "\n /    \\ /       \\/    \\ "
                + "\n/______________________\\  "
                + "\n     ___________________________________________"
                + "\n    /  D___________________E____________________"
                + "\n   /   /              /\\     /\\       /\\  /\\"
                + "\n  /   /              /  \\   /  \\/\\   /  \\/  \\"
                + "\n /   /              /    \\ /       \\/        \\ "
                + "\n( C (              /__________________________\\                "
                + "\n \\   \\                Creepy Mountains"
                + "\n  \\   \\__________________"
                + "\n   \\__B___________________A ");
    }

    private void beach() {
        try {
            MapControl.createMap();
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
                this.console.println("                \\   \\              / \\  |  / \\          "
                        + "\n                 \\   \\            /   \\ | /   \\        "
                        + "\n                  \\   \\                | |              "
                        + "\n                   ) E )              /  /"
                        + "\n                  /   /              /  /"
                        + "\n                 /   /          Mermaid Beach"
                        + "\n                ( D (________________________"
                        + "\n                 \\_____________C__________  B \\"
                        + "\n                                           \\   \\"
                        + "\n                                            \\   \\                "
                        + "\n                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~ ) A )"
                        + "\n                                            /   /                       ");

    }

    private void desert() {
        try {    
            MapControl.createMap();
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
                    this.console.println("           \\   \\                           /\\ /  \\                       "
                            + "\n            \\   \\                         / | |  |     "
                            + "\n             \\   \\                       |  |_|  | /\\"
                            + "\n              \\ E \\                      \\___    |/ |                          "
                            + "\n               \\   \\                         |     /                      "
                            + "\n                \\   \\                        |    |       "
                            + "\n                 \\   \\                       |    |"
                            + "\n                  ) D )"
                            + "\n                 /   /                  Dangerous Desert"
                            + "\n                /   /"
                            + "\n               ( C (_________________________"
                            + "\n                \\_____________B__________ A  \\"
                            + "\n                                          \\   \\");

    }

    private void cave() {
        try {    
            MapControl.createMap();
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
                this.console.println("                              \\   \\                          "
                        + "\n         _______________       \\   \\                           "
                        + "\n        /    ________    \\      \\   \\"
                        + "\n       /    /||||||||\\    \\      \\   \\"
                        + "\n      /    /||||||||||\\    \\      \\   \\"
                        + "\n     /    /||||||||||||\\    \\      ) E )                  "
                        + "\n            Crystal Caves         /   /                 "
                        + "\n        ________________________ /   /                   "
                        + "\n       / B ___________C__________D__/                     "
                        + "\n      /   /                                                                                     "
                        + "\n     ( A (    "
                        + "\n      \\   \\");

    }
}