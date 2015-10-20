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
 * @author Trent Buckner and Nina Sanchez
 */
public class DistancePuzzleControlTest {
    
    public DistancePuzzleControlTest() {
    }

    /**
     * Test of calcDistancePuzzle method, of class DistancePuzzleControl.
     */
    @Test
    public void testCalcDistancePuzzle() {
        
        System.out.println("calcDistancePuzzle");
        
        //TEST CASE 1 Correct Answer
        System.out.println("/tTest Case #1");
        double north = 20.0;
        double east = 10.0;
        double west = 30.0;
        double south = 0.0;
        DistancePuzzleControl instance1 = new DistancePuzzleControl();
        double expResult = 40.0;
        double result = instance1.calcDistancePuzzle(north, east, west, south);
        assertEquals(expResult, result, 0.0);
        
        //TEST CASE 2 Value is negative
        System.out.println("/tTest Case #2");
        north = -20.0;
        east = 10.0;
        west = 30.0;
        south = 0.0;
        DistancePuzzleControl instance2 = new DistancePuzzleControl();
        expResult = 0.0;
        result = instance1.calcDistancePuzzle(north, east, west, south);
        assertEquals(expResult, result, 0.0);
        
        //TEST CASE 3 Value is not a number
        System.out.println("/tTest Case #3");
        north = Double.NaN;
        east = Double.NaN;
        west = 30.0;
        south = 0.0;
        DistancePuzzleControl instance3 = new DistancePuzzleControl();
        expResult = 0.0;
        result = instance1.calcDistancePuzzle(north, east, west, south);
        assertEquals(expResult, result, 0.0);
        
        //TEST CASE 4 Value is not a multiple of 10
        System.out.println("/tTest Case #4");
        north = 15.0;
        east = 10.0;
        west = 30.0;
        south = 0.0;
        DistancePuzzleControl instance4 = new DistancePuzzleControl();
        expResult = 0.0;
        result = instance1.calcDistancePuzzle(north, east, west, south);
        assertEquals(expResult, result, 0.0);
        
        //TEST CASE 5 Minimun Boundaries
        System.out.println("/tTest Case #5");
        north = 0.0;
        east = 0.0;
        west = 0.0;
        south = 0.0;
        DistancePuzzleControl instance5 = new DistancePuzzleControl();
        expResult = 0.0;
        result = instance1.calcDistancePuzzle(north, east, west, south);
        assertEquals(expResult, result, 0.0);
        
        //TEST CASE 6 Maximum Boundaries
        System.out.println("/tTest Case #6");
        north = 50.0;
        east = 50.0;
        west = 50.0;
        south = 50.0;
        DistancePuzzleControl instance6 = new DistancePuzzleControl();
        expResult = 0.0;
        result = instance1.calcDistancePuzzle(north, east, west, south);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
