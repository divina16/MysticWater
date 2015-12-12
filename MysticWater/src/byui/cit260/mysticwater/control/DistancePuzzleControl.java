package byui.cit260.mysticwater.control;

import java.util.Random;

/**
 *
 * @author Trent Buckner and Nina Sanchez
 */
public class DistancePuzzleControl {

    public static boolean calcDistancePuzzle(int[] randomLocations, int[] answers) {

        int x = randomLocations[2] - randomLocations[0];
        int y = randomLocations[3] - randomLocations[1];
        int answerNorth = answers[0];
        int answerSouth = answers[1];
        int answerEast = answers[2];
        int answerWest = answers[3];

        if (answerEast - answerWest == x && answerSouth - answerNorth == y) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] getRandomValues() {

        int[] randomValues = new int[4];

        Random randa = new Random();
        randomValues[0] = randa.nextInt(4);
        Random randb = new Random();
        randomValues[1] = randb.nextInt(4);
        Random randc = new Random();
        randomValues[2] = randc.nextInt(4);
        Random randd = new Random();
        randomValues[3] = randd.nextInt(4);

        return randomValues;
    }
}
