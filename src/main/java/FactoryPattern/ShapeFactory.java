package FactoryPattern;

import FactoryPattern.object.Shape;
import FactoryPattern.object.impl.Circle;
import FactoryPattern.object.impl.Rectangle;
import FactoryPattern.object.impl.Square;

/**
 * Comments:
 * 类比：汽车工厂，可以生产SUV或跑车
 * 用户买车不需要知道工厂的车是怎么造出来的，只需要付钱提车即可。
 * 若提车的动作叫做getCar，那么调用getCar时传入我要SUV还是跑车即可。
 *
 * 工厂模式适合创建一些复杂对象的时候使用，平时的只需要通过new来创建的对象，无需使用工厂模式，使用的话反而会对系统造成压力。
 *
 * Created by Lord_X_ on 2016/11/9.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
