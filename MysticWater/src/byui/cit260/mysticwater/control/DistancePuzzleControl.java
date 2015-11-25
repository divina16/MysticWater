package byui.cit260.mysticwater.control;

/**
*
* @author Trent Buckner and Nina Sanchez
*/
public class DistancePuzzleControl {
    
    public double calcDistancePuzzle(double north, double east, double west, double south) {
        
        if (north == south && west == east) {
           return (north - south) + (west - east);
        }
        if (north < 0 || north > 50 || north % 10 != 0) {
            return -1;
        }
        
        if (south < 0 || south > 50 || south % 10 != 0) {
            return -1;
        }
        
       if (east < 0 || east > 50 || east % 10 != 0) {
            return -1;
        }
        
        if (west < 0 || west > 50 || west % 10 != 0) {
            return -1;
        }
        
        if (west >= east) {
            return (west - east) + north + south;
        }
        
        if (north >= south) {
            return (north - south) + east + west;
        }
        if (east >= west) {
            return (east - west) + north + south;
        }
        
        if (south >= north) {
            return (south - north) + west + east;
        }
        
       double total = north + east + west + south;
            return total;
}
}
