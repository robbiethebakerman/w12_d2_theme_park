package ThemeParkTest.StallsTest;

import ThemePark.Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Feasts and Fabs", "Robbie", 4);
    }

    @Test
    public void hasName() {
        assertEquals("Feasts and Fabs", iceCreamStall.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(4, iceCreamStall.getRating());
    }
}
