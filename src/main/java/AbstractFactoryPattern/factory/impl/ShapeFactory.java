package AbstractFactoryPattern.factory.impl;

import AbstractFactoryPattern.factory.AbstractFactory;
import AbstractFactoryPattern.object.Color;
import AbstractFactoryPattern.object.Shape;
import AbstractFactoryPattern.object.impl.shape.Circle;
import AbstractFactoryPattern.object.impl.shape.Rectangle;
import AbstractFactoryPattern.object.impl.shape.Square;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {

        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
