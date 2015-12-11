/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.MapControl;
import byui.cit260.mysticwater.exceptions.MapControlException;
import byui.cit260.mysticwater.model.Player;
import mysticwater.MysticWater;

/**
 *
 * @author Nina Sanchez
 */
public class MoveCharacterView extends View {

    static MoveCharacterView move;

    public MoveCharacterView() {
        super("\n\n"
                + "\n------------------------------------\n"
                + "\n|Where would you like to travel to?|\n"
                + "\n------------------------------------\n"
                + "\nPlease enter number of spaces you want to move forward:");
    }

    @Override
    public boolean doAction(Object obj) {

        try {
            int currentColumn = Integer.parseInt((String)obj);
            Player player = MysticWater.getCurrentGame().getPlayer();
            MapControl.moveCharacter(currentColumn, player);
            this.console.println(MysticWater.getCurrentGame().getPlayer().getLocation());
//            gameMenu.displayView();
            return true;
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), "You can't move until you help the character in this location.");
            return false;
        }
//        return true;
    }

    public static MoveCharacterView getInstance() {

        if (move == null) {
            move = new MoveCharacterView();
        }
        return move;
    }
}
