import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by mcarifio on 3/25/16.
 */
public class DiamondTest {

    private String boston = "Boston";
    private String new_york = "New York";
    private String redsox_name = "RedSox";
    private String yankees_name = "Yankees";
    private String fenway_park_name = "Fenway Park";
    private FieldedTeam redsox = new FieldedTeam(boston, redsox_name, new LinkedList<Player>());
    private FieldedTeam yankees = new FieldedTeam(new_york, yankees_name, new LinkedList<Player>());
    private Diamond fenway_park = new Diamond(fenway_park_name, yankees, redsox);


    @Test
    public void testAt_bat() throws Exception {
    }

    @Test
    public void testDefending() throws Exception {
    }

    @Test
    public void testWhere() throws Exception {
        assertEquals(fenway_park.where(), fenway_park_name);
    }
}