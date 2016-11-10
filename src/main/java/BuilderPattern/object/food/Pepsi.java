package BuilderPattern.object.food;

import BuilderPattern.object.impl.ColdDrink;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi Cola";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
