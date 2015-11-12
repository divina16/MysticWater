/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.MapControl;
import mysticwater.MysticWater;

/**
 *
 * @author Nina Sanchez
 */
public class MapView extends View {

    static MapView map;
    
    public MapView() {
    
        super("\n"
            + "\n-----------------------------------"
            + "\n|Map Menu                         |"
            + "\n-----------------------------------"
            + "\nM - Mountains"
            + "\nF - Forest"
            + "\nD - Desert"
            + "\nC - Caves"
            + "\nB - Beach"
            + "\nE - Exit Map"
            + "\n-----------------------------------");
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
                this.exit();
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;       
        }
        return false;
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

    private void exit() {
        System.out.println("exitMap was called.");
    }
}