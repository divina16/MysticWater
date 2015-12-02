/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.MoveCharacterControl;
import mysticwater.MysticWater;

/**
 *
 * @author Nina Sanchez
 */
public class MoveCharacterView extends View {
    
    static MoveCharacterView move;
    
     public MoveCharacterView() {
         super("\n"
            + "\n------------------------------------"
            + "\n|Where would you like to travel to?|"
            + "\n------------------------------------"
            + "\nM - Mountains"
            + "\nF - Forest"
            + "\nD - Desert"
            + "\nC - Caves"
            + "\nB - Beach"
            + "\nE - Exit Map"
            + "\n------------------------------------");
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
                this.console.println("\n*** Invalid selection *** Try again");
                break;       
        }
        return false;
    }

    private void mountains() {
        MoveCharacterControl.createMoveCharacter(MysticWater.getPlayer());  
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
                + "\n   \\__B___________________A "
                + "\nYou are now in Location A of the Creepy Mountains.");
    
    }

    private void forest() {
        MoveCharacterControl.createMoveCharacter(MysticWater.getPlayer());   
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
                + "\n       \\   \\"
                + "\nYou are now in Location A of the Fairy Forest.");
    }
    

    private void desert() {
        MoveCharacterControl.createMoveCharacter(MysticWater.getPlayer());    
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
                            + "\n                                          \\   \\"
                            + "\nYou are now in Location A of the Dangerous Desert.");
    }

    private void cave() {
        MoveCharacterControl.createMoveCharacter(MysticWater.getPlayer());  
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
                        + "\n      \\   \\"
                        + "\nYou are now in Location A of the Crystal Caves.");
    }

    private void beach() {
        MoveCharacterControl.createMoveCharacter(MysticWater.getPlayer());
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
                        + "\n                                            /   /                       "
                        + "\nYou are now in Location A in Mermaid Beach.");
    }

    private void exit() {
        MoveCharacterControl.createMoveCharacter(MysticWater.getPlayer());   
    }
    
}
