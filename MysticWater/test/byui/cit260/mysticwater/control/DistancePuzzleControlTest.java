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
        
        //Test Case 1
        
        System.out.println("/tTest case #1");
        
        //input values for test case 1
        double north = 20.0;
        double east = 10.0;
        double west = 30.0;
        double south = 0.0;
        
        //expected result
        double expResult = 40.0;
        
        //create instance of DistancePuzzleControl
        DistancePuzzleControl instance = new DistancePuzzleControl();
        
        //call function to run test
        double result = instance.calcDistancePuzzle(north, east, west, south);
        
        //compare expected result to value returned
        assertEquals(expResult, result, 0.0);
        
        //Test Case 2
        
        System.out.println("/tTest case #2");
        
        //input values for test case 1
        north = -20.0;
        east = 10.0;
        west = 30.0;
        south = 0.0;
        
        //expected result
        expResult = 0.0;
        
        //create instance of DistancePuzzleControl
        DistancePuzzleControl instance2 = new DistancePuzzleControl();
        
        //call function to run test
        result = instance.calcDistancePuzzle(north, east, west, south);
        
        //compare expected result to value returned
        assertEquals(expResult, result, 0.0);
        
        //Test Case 3
        
        System.out.println("/tTest case #3");
        
        //input values for test case 3
        north = Double.NaN;
        east = Double.NaN;
        west = 30.0;
        south = 0.0;
        
        //expected result
        expResult = 0.0;
        
        //create instance of DistancePuzzleControl
        DistancePuzzleControl instance3 = new DistancePuzzleControl();
        
        //call function to run test
        result = instance.calcDistancePuzzle(north, east, west, south);
        
        //compare expected result to value returned
        assertEquals(expResult, result, 0.0);
        
        //Test Case 4
        
        System.out.println("/tTest case #4");
        
        //input values for test case 4
        north = 15.0;
        east = 10.0;
        west = 30.0;
        south = 0.0;
        
        //expected result
        expResult = 0.0;
        
        //create instance of DistancePuzzleControl
        DistancePuzzleControl instance4 = new DistancePuzzleControl();
        
        //call function to run test
        result = instance.calcDistancePuzzle(north, east, west, south);
        
        //compare expected result to value returned
        assertEquals(expResult, result, 0.0);
        
    }
    
}
