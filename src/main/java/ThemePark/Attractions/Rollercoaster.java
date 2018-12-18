package ThemePark.Attractions;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 145) {
            return true;
        }
        return false;
    }
}
