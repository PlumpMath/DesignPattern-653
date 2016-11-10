package AbstractFactoryPattern.factory.impl;

import AbstractFactoryPattern.factory.AbstractFactory;
import AbstractFactoryPattern.object.Color;
import AbstractFactoryPattern.object.Shape;
import AbstractFactoryPattern.object.impl.color.Blue;
import AbstractFactoryPattern.object.impl.color.Green;
import AbstractFactoryPattern.object.impl.color.Red;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("Green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("Blue")) {
            return new Blue();
        }
        return null;
    }


    @Override
    public Shape getShape(String shape) {
        return null;
    }

}
