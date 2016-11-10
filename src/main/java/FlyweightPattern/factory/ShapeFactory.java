package FlyweightPattern.factory;

import FlyweightPattern.object.Shape;
import FlyweightPattern.object.impl.Circle;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lord_X_ on 2016/11/10.
 */
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("create new color");
        }
        return circle;
    }
}
