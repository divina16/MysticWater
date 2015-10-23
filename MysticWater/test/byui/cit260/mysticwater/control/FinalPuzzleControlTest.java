/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Trent Buckner
 */
public class FinalPuzzleControlTest {
    
    public FinalPuzzleControlTest() {
    }

    /**
     * Test of calcFinalPuzzle method, of class FinalPuzzleControl.
     */
    @Test
    public void testCalcFinalPuzzle() {
        System.out.println("calcFinalPuzzle");
        
        //TEST CASE 0 Value is correct
        System.out.println("/tTest Case #0");
        int answerRiddle = 7;
        FinalPuzzleControl instance0 = new FinalPuzzleControl();
        
        boolean success = this.testValid(answerRiddle, instance0);
        assertTrue(success);
        
        //TEST CASE 1 Value is incorrect
        System.out.println("/tTest Case #1");
        answerRiddle = 7;
        
        success = this.testInvalid(answerRiddle, instance0);
        assertTrue(success);
        
        //TEST CASE 2 Value exceeds minimum
        System.out.println("/tTest Case #2");
        answerRiddle = -1;
        int expResult = -1;
        int result = instance0.calcFinalPuzzle(answerRiddle);
        assertEquals(expResult, result);
        
        //TEST CASE 3 Value exceeds maximum
        System.out.println("/tTest Case #3");
        answerRiddle = 15;
        expResult = -1;
        result = instance0.calcFinalPuzzle(answerRiddle);
        assertEquals(expResult, result);
        
        //TEST CASE 4 Maximum Boundary
        System.out.println("/tTest Case #4");
        answerRiddle = 10;
        
        success = this.testValid(answerRiddle, instance0);
        assertTrue(success);
        
        //TEST CASE 5 Minimum Boundary
        System.out.println("/tTest Case #5");
        answerRiddle = 1;
        
        success = this.testValid(answerRiddle, instance0);
        assertTrue(success);

    }
    private boolean testValid (int answerRiddle, FinalPuzzleControl control) {
        int result = 0;
        int counter = 0;
        while (result != 1) {
            result = control.calcFinalPuzzle(answerRiddle);
            counter ++;
            
            if (counter > 100000000) {
                return false;
            }
        }
        return true;
    }
    private boolean testInvalid (int answerRiddle, FinalPuzzleControl control) {
        int result = 0;
        int counter = 0;
        while (result != 0) {
            result = control.calcFinalPuzzle(answerRiddle);
            counter ++;
            
            if (counter > 100000000) {
                return false;
            }
        }
        return true;
    }
}
