package PrototypePattern.impl;

import PrototypePattern.Shape;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
