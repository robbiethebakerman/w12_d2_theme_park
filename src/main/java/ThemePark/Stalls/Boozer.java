package ThemePark.Stalls;

import ThemePark.ISecurity;
import ThemePark.Visitor;

public class Boozer extends Stall implements ISecurity {

    public Boozer(String name, String ownerName, int rating) {
        super(name, ownerName, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 17) {
            return true;
        }
        return false;
    }
}
