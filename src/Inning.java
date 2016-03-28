import java.util.List;

/**
 * Created by mcarifio on 3/24/16.
 */
public class Inning {
    private FieldedTeam visitor;
    private FieldedTeam home;
    Score inningScore = new Score();

    public Inning(FieldedTeam visitor, FieldedTeam home) {
        this.visitor = visitor;
        this.home = home;
    }

    public Score play() {
        int outs = 0;
        Player[] bases = new Player[4]; // bases are empty

        while (outs <= 3) {
            Player batter = visitor.nextBatter();
            int play = batter.hit();

        }
    }
}
