package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.object.Color;
import AbstractFactoryPattern.object.Shape;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
