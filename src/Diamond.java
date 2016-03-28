/**
 * Created by mcarifio on 3/24/16.
 */
public class Diamond {
    private String name; // finalize during ctor?
    Team[] teams;
    int at_bat = 0;

    // TODO: should Game be a part of Diamond?
    public Diamond(String name, Team visitor, Team home) {
        this.name = name;
        Team[] teams = new Team[] { visitor, home };
    }

    public String where() { return this.name; }

    Team at_bat() { return this.teams[this.at_bat]; }
    Team defending() { return this.teams[(this.at_bat + 1) % 2]; }
}
