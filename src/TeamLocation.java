/**
 * Created by mcarifio on 3/25/16.
 */
public enum TeamLocation {
    VISTOR, HOME;

    public static TeamLocation not(TeamLocation tl) {
        if (tl == VISTOR) return HOME;
        return VISTOR;
    }
}
