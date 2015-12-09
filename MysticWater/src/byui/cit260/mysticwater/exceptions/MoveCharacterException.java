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
public class MoveCharacterException extends Exception{

    public MoveCharacterException() {
    }

    public MoveCharacterException(String message) {
        super(message);
    }

    public MoveCharacterException(String message, Throwable cause) {
        super(message, cause);
    }

    public MoveCharacterException(Throwable cause) {
        super(cause);
    }

    public MoveCharacterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
   
}
}
