/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.exceptions;

/**
 *
 * @author Nina Sanchez
 */
public class DistancePuzzleException extends Exception {
    
    public DistancePuzzleException() {
    }

    public DistancePuzzleException(String message) {
        super(message);
    }

    public DistancePuzzleException(String message, Throwable cause) {
        super(message, cause);
    }

    public DistancePuzzleException(Throwable cause) {
        super(cause);
    }

    public DistancePuzzleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
