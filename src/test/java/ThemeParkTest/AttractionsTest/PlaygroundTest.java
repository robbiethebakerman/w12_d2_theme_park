package ThemeParkTest.AttractionsTest;

import ThemePark.Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlaygroundTest {

    private Playground playground;
    private Visitor weirdOldMan;
    private Visitor innocentYoungChild;

    @Before
    public void before() {
        playground = new Playground("Child's Play", 3);
        weirdOldMan = new Visitor(75, 175, 50.70);
        innocentYoungChild = new Visitor(7, 140, 1.50);
    }

    @Test
    public void hasName() {
        assertEquals("Child's Play", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(3, playground.getRating());
    }

    @Test
    public void canCheckVisitorIsAllowedTrue() {
        assertTrue(playground.isAllowedTo(innocentYoungChild));
    }

    @Test
    public void canCheckVisitorIsAlllowedFalse() {
        assertFalse(playground.isAllowedTo(weirdOldMan));
    }
}
