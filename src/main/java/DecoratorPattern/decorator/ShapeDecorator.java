package DecoratorPattern.decorator;

import DecoratorPattern.object.Shape;

/**
 * Created by Lord_X_ on 2016/11/10.
 */
public class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }


    public void draw() {
        decoratorShape.draw();
    }
}
