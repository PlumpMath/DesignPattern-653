package BuilderPattern.object.food;

import BuilderPattern.object.impl.Burger;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
