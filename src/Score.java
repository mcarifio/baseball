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

    public String toString() {
        return String.format("%s to %s", this.visitor, this.home);
    }

    public int visitor_score() { return this.visitor; }
    public int home_score() { return this.home; }

    public int visitor_scores(int runs) { return this.visitor += runs; } // visitor scores a run
    public int visitor_scores() { return this.visitor_scores(1); } // visitor scores a run
    public int home_scores(int runs) { return this.home += runs; } // home scores a run
    public int home_scores() { return this.home_scores(1); } // home scores a run

    public boolean leads() {
        return this.visitor < this.home;
    }
}
