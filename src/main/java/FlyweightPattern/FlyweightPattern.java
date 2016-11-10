package FlyweightPattern;

import FlyweightPattern.factory.ShapeFactory;
import FlyweightPattern.object.impl.Circle;

import java.util.Map;

/**
 * 享元设计模式
 * 需求：比如设计线程池，数据库连接池。
 * java中，String类的设计就是享元设计模式。
 * 设计上类似缓存设计。
 * 用Map实现，
 * Created by Lord_X_ on 2016/11/10.
 */
public class FlyweightPattern {

    private static final String[] colors = {"red", "blue", "green", "grey", "pink"};

    public static void main(String[] args) {
        for (int i=0;i<20;i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
