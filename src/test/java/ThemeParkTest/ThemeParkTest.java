package ThemeParkTest;

import ThemePark.Attractions.Attraction;
import ThemePark.Attractions.Rollercoaster;
import ThemePark.Stalls.Boozer;
import ThemePark.ThemePark;
import ThemePark.IReviewed;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private Rollercoaster rollercoaster;
    private Boozer boozer;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Rickety Wonder", 2);
        boozer = new Boozer("Get Drunk and Throw Up on the Teacups", "Evil Entrepeneur", 5);
        themePark = new ThemePark();
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(rollercoaster);
        ArrayList<Attraction> expectedAttractions = new ArrayList<>();
        expectedAttractions.add(rollercoaster);
        assertEquals(expectedAttractions, themePark.getAttractions());
    }

    @Test
    public void canAddStall() {
        themePark.addStall(boozer);
        ArrayList<Boozer> expectedStalls = new ArrayList<>();
        expectedStalls.add(boozer);
        assertEquals(expectedStalls, themePark.getStalls());
    }

    @Test
    public void canGetAllReviewed() {
        themePark.addAttraction(rollercoaster);
        themePark.addStall(boozer);
        ArrayList<IReviewed> expectedIRevieweds = new ArrayList<>(Arrays.asList(rollercoaster, boozer));
        assertEquals(expectedIRevieweds, themePark.getAllReviewed());
    }
}
