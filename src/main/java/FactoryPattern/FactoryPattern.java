package FactoryPattern;

import FactoryPattern.object.Shape;

/**
 * 工厂模式
 * Created by Lord_X_ on 2016/11/9.
 */
public class FactoryPattern {



    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape shape1 = sf.getShape("circle");
        shape1.draw();

        Shape shape2 = sf.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = sf.getShape("SQUare");
        shape3.draw();

    }
}
