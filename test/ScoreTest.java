import static org.junit.Assert.*;

/**
 * Created by mcarifio on 3/24/16.
 */
public class ScoreTest {

    @org.junit.Test
    public void testToString() throws Exception {
        Score s = new Score(10, 10);
        assertEquals(s.toString(), "10 to 10");
    }

    @org.junit.Test
    public void testCtorScore() throws Exception {
        Score s = new Score();
        assertEquals(s.home_score(), 0);
        assertEquals(s.visitor_score(), 0);
    }

    @org.junit.Test
    public void testScoreRuns() throws Exception {
        Score s = new Score();
        assertEquals(s.home_score(), 0);
        assertEquals(s.visitor_score(), 0);

        assertEquals(s.visitor_scores(), 1);
        assertEquals(s.visitor_score(), 1);

        assertEquals(s.home_scores(), 1);
        assertEquals(s.home_score(), 1);

    }

    @org.junit.Test
    public void testVisitor() throws Exception {

    }

    @org.junit.Test
    public void testHome() throws Exception {

    }

    @org.junit.Test
    public void testVisitor_scores() throws Exception {

    }

    @org.junit.Test
    public void testHome_scores() throws Exception {

    }

    @org.junit.Test
    public void testLeads() throws Exception {

    }
}