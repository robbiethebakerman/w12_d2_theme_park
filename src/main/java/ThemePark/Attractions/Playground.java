package ThemePark.Attractions;

import ThemePark.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 16) {
            return true;
        }
        return false;
    }
}
