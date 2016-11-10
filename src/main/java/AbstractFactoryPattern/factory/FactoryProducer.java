package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.factory.impl.ColorFactory;
import AbstractFactoryPattern.factory.impl.ShapeFactory;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
