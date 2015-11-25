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
public class PuzzleException extends Exception{

    public PuzzleException() {
    }

    public PuzzleException(String message) {
        super(message);
    }

    public PuzzleException(String message, Throwable cause) {
        super(message, cause);
    }

    public PuzzleException(Throwable cause) {
        super(cause);
    }

    public PuzzleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
