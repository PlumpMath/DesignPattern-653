package DecoratorPattern.object.impl;

import DecoratorPattern.object.Shape;

/**
 * Created by Lord_X_ on 2016/11/10.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
