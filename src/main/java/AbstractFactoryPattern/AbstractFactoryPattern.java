package AbstractFactoryPattern;

import AbstractFactoryPattern.factory.AbstractFactory;
import AbstractFactoryPattern.factory.FactoryProducer;
import AbstractFactoryPattern.object.Color;
import AbstractFactoryPattern.object.Shape;

/**
 * 抽象工厂模式
 * Created by Lord_X_ on 2016/11/9.
 */
public class AbstractFactoryPattern {



    public static void main(String[] args) {

        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("red");
        color1.fill();

        Color color2 = colorFactory.getColor("green");
        color2.fill();

        Color color3 = colorFactory.getColor("blue");
        color3.fill();
    }
}
