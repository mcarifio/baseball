/**
 *
 */

import java.lang.Math.*;
import java.util.Random;


/**
 * Represents a baseball player.
 * TODO: add expected position, other stats.
 */
public class Player {

    final String name; //Player's name, e.g. "Babe Ruth"
    double average = 0.400; // Player's batting average

    // Player has a name and a batting average. Default is 400.
    public Player(String name, double average) {
        this.name = name;
        this.average = average;
    }

    // Just player's name, gets default batting average.
    public Player(String name) {
        this.name = name;
    }

    // Getter for player's name.
    public String name() {
        return this.name;
    }

    /**
     * A hit is a random int between 0 (an out) and 4 (a homerun)
     * @return
     */
    public int hit() {
        return (int) (this.average * 4 * Math.random());
    }

    // Baseball nomenclature for outs and kinds of hits.
    // TODO: make hits an enum class?
    private static String[] hitNames = new String[] { "out", "single", "double", "triple", "homerun"};
    public static String nameFor(int hit) {
        return hitNames[hit];
    }
}
