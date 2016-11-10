package PrototypePattern.impl;

import PrototypePattern.Shape;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
