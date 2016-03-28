/**
 *
 */

import java.lang.Math.*;
import java.util.Random;

public class Player {

    // Player's stats
    double average = 0.280;

    public Player(double average) {
        this.average = average;
    }

    public Player() {

    }


    /**
     * A hit is a random int between 0 (an out) and 4 (a homerun)
     * @return
     */
    public int hit() {
        return (int) (this.average * 4 * Math.random());
    }

}
