import java.util.List;

/**
 * A Team has a locate, a name and a roster of players, e.g. new Team("Boston", "Red Sox", new List<Player>(new Player("John Lester")...)
 */
public class FieldedTeam {
    private String locale;
    private String name;
    private List<Player> roster;
    private int position = 0;

    public FieldedTeam(String locale, String name, List<Player> roster) {
        this.locale = locale;
        this.name = name;
        this.roster = roster;
    }

    public Player nextBatter() {
        this.position = (this.position + 1) % roster.size();
        return this.roster.get(position);
    }
}
