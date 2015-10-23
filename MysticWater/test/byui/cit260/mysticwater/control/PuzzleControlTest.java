/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.control;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nina Sanchez
 */
public class PuzzleControlTest {
    
    public PuzzleControlTest() {
    }

    /**
     * Test of calcPuzzle method, of class PuzzleControl.
     */
    @Test
    public void testCalcPuzzle() {
        System.out.println("calcPuzzle");
        
        System.out.println("/t Test Case 1");
        int answerRiddle = 6;
        PuzzleControl instance1 = new PuzzleControl();
        
        boolean correct = this.validTest(answerRiddle, instance1);
        assertTrue(correct);
        
        System.out.println("/t Test Case 2");
        answerRiddle = 6;
        
        correct = this.validTest(answerRiddle, instance1);
        assertTrue(correct);
        
        //tests max boundary
        System.out.println("/t Test Case 3");
        answerRiddle = 10;
        
        correct = this.validTest(answerRiddle, instance1);
        assertTrue(correct);
        
        //test min boundary
        System.out.println("/t Test Case 4");
        answerRiddle = 1;
        
        //test exceeds max for input
        System.out.println("/t Test Case 5");
        answerRiddle = 11;
        //max
        int expResult = -1;
        int result = instance1.calcPuzzle(answerRiddle);
        assertEquals(expResult, result);
        
        //test exceeds min for input
        System.out.println("/t Test Case 6");
        answerRiddle = -1;
        //min
        expResult = -1;
        result = instance1.calcPuzzle(answerRiddle);
        assertEquals(expResult, result);
        
        
    } 
    private boolean validTest(int answerRiddle, PuzzleControl control){
        int result = 0;
        int counter = 0;
        while(result != 1){
            result = control.calcPuzzle(answerRiddle);
            counter ++;
            if (counter >1000000){
                return false;
            }
        }
        return true;
    }
    private boolean invalidTest(int answerRiddle, PuzzleControl control){
        int result = 0;
        int counter = 0;
        while(result != 0){
            result = control.calcPuzzle(answerRiddle);
            counter ++;
            if (counter >1000000){
                return false;
            }
        }
        return true;
}
}
