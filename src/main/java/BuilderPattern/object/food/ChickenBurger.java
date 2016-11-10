package BuilderPattern.object.food;

import BuilderPattern.object.impl.Burger;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 15.5f;
    }
}
