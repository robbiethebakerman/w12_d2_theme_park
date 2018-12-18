package ThemeParkTest.StallsTest;

import ThemePark.Stalls.Boozer;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BoozerTest {

    private Boozer boozer;
    private Visitor emotionallyAbsentFather;
    private Visitor brightEyedYoungCherub;

    @Before
    public void before() {
        boozer = new Boozer("Negligent Parents R Us", "Robbie", 1);
        emotionallyAbsentFather = new Visitor(39, 185, 30);
        brightEyedYoungCherub = new Visitor(10, 150, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Negligent Parents R Us", boozer.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(1, boozer.getRating());
    }


    @Test
    public void canCheckVisitorIsAllowedTrue() {
        assertTrue(boozer.isAllowedTo(emotionallyAbsentFather));
    }

    @Test
    public void canCheckVisitorIsAlllowedFalse() {
        assertFalse(boozer.isAllowedTo(brightEyedYoungCherub));
    }
}
