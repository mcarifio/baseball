import java.lang.System;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // for (String s: args) {
        //    System.out.print(s + " ");
        //}
        //System.out.println();
        FieldedTeam redsox = new FieldedTeam("Boston", "RedSox", Arrays.asList(
                new Player("pitcher"),
                new Player("catcher"),
                new Player("first"),
                new Player("second"),
                new Player("third"),
                new Player("shortstop"),
                new Player("left"),
                new Player("center"),
                new Player("right")));
        FieldedTeam yankees = new FieldedTeam("New York", "Yankees", Arrays.asList(
                new Player("pitcher"),
                new Player("catcher"),
                new Player("first"),
                new Player("second"),
                new Player("third"),
                new Player("shortstop"),
                new Player("left"),
                new Player("center"),
                new Player("right")));

        Game g = new Game(new Diamond("Fenway",redsox, yankees));
        Score s = g.play();
        System.out.println(s);
    }
}
