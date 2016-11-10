package AbstractFactoryPattern.object.impl.color;

import AbstractFactoryPattern.object.Color;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() mothod.");
    }
}
