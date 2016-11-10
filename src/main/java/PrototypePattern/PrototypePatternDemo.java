package PrototypePattern;

/**
 * 原型模式
 * 通过克隆来创建多个实例对象。
 * 对于通过new创建对象有很大开销的操作，可以使用克隆的方式，
 * 或者类似建立数据库链接的操作，如果需要多个对象，可以建立一次数据库的链接对象，其他对象通过克隆的方式获取
 * Created by Lord_X_ on 2016/11/9.
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        Shape clonedShape4 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
        System.out.println("Shape type 1 is equal ? " + (clonedShape == clonedShape4));
        System.out.println("1 : " + clonedShape.getType());
        System.out.println("2 : " + clonedShape4.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
