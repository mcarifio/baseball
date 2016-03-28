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

    // offense gets to bat
    public int bat(FieldedTeam offense) {
        int outs = 0;
        Player[] bases = new Player[3]; // bases are empty
        int score = 0; // no scores
        int onbase = 0; // noo ne on base

        while (outs < 3) {
            Player batter = offense.nextBatter();
            int hit = batter.hit();

            if (hit > 0 && hit < 4) {
                // Note: only score if forced, not real baseball
                score += (onbase + hit) % bases.length;
                onbase = (onbase + hit) % bases.length;

                // Players move forward along the bases 'hit' bases.
                for (int i = bases.length - 1; i > hit; --i) if (bases[i - hit] != null) bases[i] = bases[i - hit];
                for (int i = 0; i < hit; ++i) bases[i] = null;
                bases[hit] = batter;
            } else if (hit == 4) {
                score += onbase + 1;
                onbase = 0;
                for (int i = 0; i < bases.length - 1; ++i) bases[i] = null;
            } else {
                ++outs;
            }
        }

        return score;
    }

    public Score play() {
        return new Score(this.bat(this.visitor), this.bat(this.home));
    }
}
