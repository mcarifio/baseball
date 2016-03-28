import java.util.List;

/**
 * Created by mcarifio on 3/27/16.
 */
public class FieldedTeam {
    private List<Player> team;
    private int position = 0;

    public FieldedTeam(List<Player> team) {
        if (team.size() != 9) {
            throw new IllegalArgumentException(String.format("A fielded team has 9 players. Yours has {s}.", team.size()));
        }
        this.team = team;
    }

    public Player nextBatter() {
        this.position = (position + 1) % this.team.size();
        return this.team.get(position);
    }



}
