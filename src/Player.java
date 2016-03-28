/**
 *
 */

import java.lang.Math.*;
import java.util.Random;

public class Player {

    String name;
    // Player's stats
    double average = 0.280;

    public Player(String name, double average) {
        this.name = name;
        this.average = average;
    }

    public Player(String name) {
        this.name = name;
    }


    /**
     * A hit is a random int between 0 (an out) and 4 (a homerun)
     * @return
     */
    public int hit() {
        return (int) (this.average * 4 * Math.random());
    }

}
