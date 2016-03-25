/**
 * Created by mcarifio on 3/24/16.
 */
public class Diamond {
    private String name; // finalize during ctor?
    TeamLocation at_bat = TeamLocation.VISTOR;
    Team visitor, home;

    // TODO: should Game be a part of Diamond?
    public Diamond(String name, Team visitor, Team home) {
        this.name = name;
        this.visitor = visitor;
        this.home = home;
    }

    public String where() { return this.name; }

    TeamLocation at_bat() { return this.at_bat; }
    TeamLocation defending() { return TeamLocation.not(this.at_bat); }

}
