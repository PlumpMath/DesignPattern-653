package BuilderPattern.object.impl;

import BuilderPattern.object.Item;
import BuilderPattern.object.Packing;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
