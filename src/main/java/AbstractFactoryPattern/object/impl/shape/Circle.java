package AbstractFactoryPattern.object.impl.shape;

import AbstractFactoryPattern.object.Shape;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}