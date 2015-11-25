/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.exceptions.GameControlException;

/**
 *
 * @author Trent Buckner
 */
public interface ViewInterface {
    public void displayView();
    public String getInput() throws GameControlException;
    public boolean doAction(Object obj);
}
