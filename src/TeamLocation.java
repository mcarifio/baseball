/**
 * Not used yet.
 */
public enum TeamLocation {
    VISTOR, HOME;

    public static TeamLocation not(TeamLocation tl) {
        if (tl == VISTOR) return HOME;
        return VISTOR;
    }
}
