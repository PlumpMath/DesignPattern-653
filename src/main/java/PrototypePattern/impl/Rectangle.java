package PrototypePattern.impl;


import PrototypePattern.Shape;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
