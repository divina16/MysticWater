/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.MapControl;
import java.util.Scanner;
import mysticwater.MysticWater;

/**
 *
 * @author Nina Sanchez
 */
public class MapView {

    static MapView map;
    
    private final String MAP = "\n"
            + "\n-----------------------------------"
            + "\n|Map Menu                         |"
            + "\n-----------------------------------"
            + "\nM - Mountains"
            + "\nF - Forest"
            + "\nD - Desert"
            + "\nC - Caves"
            + "\nB - Beach"
            + "\nE - Exit Map"
            + "\n-----------------------------------";

    void displayMap() {
        char selection = ' ';
        do {
            System.out.println(MAP);
            
            String input = this.mapViewRequest();
            selection = input.charAt(0);
            
            this.doMapSelection(selection);
            
        } while (selection != 'E');
    }
    private String mapViewRequest() {
    boolean valid = false;
       String mapViewRequest = null;
       Scanner keyboard = new Scanner(System.in);
       
       while (!valid) {
          
           System.out.println("Select an option by entering the corresponding letter:");
           
           mapViewRequest = keyboard.nextLine();
           mapViewRequest = mapViewRequest.trim();
           
           if (mapViewRequest.length() == 0) {
               System.out.println("Invalid input - the value must not be blank");
               continue;
           }
           break;
       }
       return mapViewRequest;
    }
    
    private void doMapSelection(char selection) {
        
        switch (selection) {
            case 'M':
                this.mountains();
                break;
            case 'F':
                this.forest();
                break;
            case 'D':
                this.desert();
                break;
            case 'C':
                this.cave();
                break;
            case 'B':
                this.beach();
                break;
            case 'E':
                this.exitMap();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;       
        }
}

    private void forest() {
        MapControl.createMap(MysticWater.getPlayer());    
        System.out.println("\n                                \\   \\                                 "
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
        MapControl.createMap(MysticWater.getPlayer());    
        System.out.println("   /\\     /\\       /\\ "
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
        MapControl.createMap(MysticWater.getPlayer());
                System.out.println("                \\   \\              / \\  |  / \\          "
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
        MapControl.createMap(MysticWater.getPlayer());    
                    System.out.println("           \\   \\                           /\\ /  \\                       "
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
        MapControl.createMap(MysticWater.getPlayer());    
                System.out.println("                              \\   \\                          "
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

    private void exitMap() {
        System.out.println("exitMap was called.");
    }
}