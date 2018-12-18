package ThemePark;

import ThemePark.Attractions.Attraction;
import ThemePark.Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private double revenue;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.revenue = 0.00;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> allReviewed = new ArrayList<>();
        for (Attraction attraction : attractions) {
            allReviewed.add(attraction);
        }
        for (Stall stall : stalls) {
            allReviewed.add(stall);
        }
        return allReviewed;
    }
}
