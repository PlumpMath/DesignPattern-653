package DecoratorPattern;

import DecoratorPattern.decorator.extendImpl.RedShapeDecorator;
import DecoratorPattern.object.Shape;
import DecoratorPattern.object.impl.Circle;

/**
 * 装饰者模式
 * 作用是替代继承，在不变原有类的基础上，给类的方法增加功能。
 *
 * Created by Lord_X_ on 2016/11/10.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.draw();
        Shape decoratorCircle = new RedShapeDecorator(circle);
        decoratorCircle.draw();

    }
}
