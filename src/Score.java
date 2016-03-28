/**
 * Created by mcarifio on 3/24/16.
 */
public class Score {

    private int visitor = 0;
    private int home = 0;

    private void init(int visitor, int home) {
        this.visitor = visitor; this.home = home;
    }

    public Score(int visitor, int home) {
        this.init(visitor, home);
    }

    public Score() {
        this.init(0, 0);
    }

    /**
     * Report score as a string.
     * @return
     */
    public String toString() {
        return String.format("%s to %s", this.visitor, this.home);
    }

    /**
     * Return visitor or home current score.
     * @return
     */
    public int visitor_score() { return this.visitor; }
    public int home_score() { return this.home; }

    /**
     * Increment the score for visitor or home by some number of runs, default is 1.
     * @param runs
     * @return
     */
    public int visitor_scores(int runs) { return this.visitor += runs; } // visitor scores a run
    public int visitor_scores() { return this.visitor_scores(1); } // visitor scores a run
    public int home_scores(int runs) { return this.home += runs; } // home scores a run
    public int home_scores() { return this.home_scores(1); } // home scores a run

    /**
     * True iff home team leads.
     * @return
     */
    public boolean leads() {
        return this.visitor < this.home;
    }

    /**
     * Add the inning's score to the total score.
     * @param inningScore
     * @return
     */
    public void add(Score inningScore) {
        this.visitor += inningScore.visitor_score();
        this.home += inningScore.home_score();
    }
}
