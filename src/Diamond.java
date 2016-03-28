import java.util.Arrays;

public class Diamond {
    private String name; // finalize during ctor?
    FieldedTeam[] teams = new FieldedTeam[2];
    int at_bat = 0;

    // TODO: should Game be a part of Diamond?
    public Diamond(String name, FieldedTeam visitor, FieldedTeam home) {
        this.name = name;
        this.teams[0] = visitor;
        this.teams[1] = home;
    }

    public String where() { return this.name; }

    FieldedTeam at_bat() { return this.teams[this.at_bat]; }
    FieldedTeam defending() { return this.teams[(this.at_bat + 1) % 2]; }

    public FieldedTeam visitor() {
        return this.teams[0];
    }

    public FieldedTeam home() {
        return this.teams[0];
    }

}
