package DecoratorPattern.decorator.extendImpl;

import DecoratorPattern.decorator.ShapeDecorator;
import DecoratorPattern.object.Shape;

/**
 * Created by Lord_X_ on 2016/11/10.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        redOtherMethod();
    }

    private void redOtherMethod() {
        System.out.println("redOtherMethod run... ");
    }
}
