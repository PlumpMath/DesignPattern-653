package BuilderPattern.object.food;

import BuilderPattern.object.impl.ColdDrink;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke Cola";
    }

    @Override
    public float price() {
        return 9.0f;
    }
}
