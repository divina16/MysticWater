package byui.cit260.mysticwater.control;

/**
*
* @author Trent Buckner and Nina Sanchez
*/
public class DistancePuzzleControl {
    
    public double calcDistancePuzzle(double north, double east, double west, double south) {
        if (north < 0 || north >= 50 || Double.isNaN(north) || north % 10 != 0) {
        return 0;
        }
        
        if (south < 0 || south >= 50 || Double.isNaN(south) || south % 10 != 0) {
            return 0;
        }
        
       if (east < 0 || east >= 50 || Double.isNaN(east) || east % 10 != 0) {
            return 0;
        }
        
        if (west < 0 || west >= 50 || Double.isNaN(west) || west % 10 != 0) {
            return 0;
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
