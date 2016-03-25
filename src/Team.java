import java.util.List;

/**
 * A Team has a locate, a name and a roster of players, e.g. new Team("Boston", "Red Sox", new List<Player>(new Player("John Lester")...)
 */
public class Team {
    private String locale;
    private String name;
    private List<Player> roster;

    Team(String locale, String name, List<Player> roster) {
        this.locale = locale;
        this.name = name;
        this.roster = roster;
    }
}
