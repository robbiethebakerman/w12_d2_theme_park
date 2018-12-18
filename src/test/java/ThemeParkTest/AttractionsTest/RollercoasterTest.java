package ThemeParkTest.AttractionsTest;

import ThemePark.Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor emotionallyAbsentFather;
    private Visitor brightEyedYoungCherub;
    private Visitor shortMan;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Big Dipper", 5);
        emotionallyAbsentFather = new Visitor(39, 185, 30);
        brightEyedYoungCherub = new Visitor(10, 150, 10);
        shortMan = new Visitor(25, 134, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Big Dipper", rollercoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, rollercoaster.getRating());
    }

    @Test
    public void canCheckVisitorIsAllowedTrue() {
        assertTrue(rollercoaster.isAllowedTo(emotionallyAbsentFather));
    }

    @Test
    public void canCheckVisitorIsAlllowedFalseTooYoung() {
        assertFalse(rollercoaster.isAllowedTo(brightEyedYoungCherub));
    }

    @Test
    public void canCheckVisitorIsAlllowedFalseTooShort() {
        assertFalse(rollercoaster.isAllowedTo(shortMan));
    }
}
