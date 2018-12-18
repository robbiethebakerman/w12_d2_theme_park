package ThemePark.Stalls;

import ThemePark.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private String ownerName;
    private int rating;

    public Stall(String name, String ownerName, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
