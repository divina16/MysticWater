/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.exceptions;

/**
 *
 * @author Trent Buckner
 */
public class FinalPuzzleException extends Exception{

    public FinalPuzzleException() {
    }

    public FinalPuzzleException(String message) {
        super(message);
    }

    public FinalPuzzleException(String message, Throwable cause) {
        super(message, cause);
    }

    public FinalPuzzleException(Throwable cause) {
        super(cause);
    }

    public FinalPuzzleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
