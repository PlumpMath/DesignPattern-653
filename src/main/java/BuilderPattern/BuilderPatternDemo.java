package BuilderPattern;

import BuilderPattern.object.Item;

/**
 * 建造者模式
 * Created by Lord_X_ on 2016/11/9.
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        Meal vegMeal = MealBuilder.prepareVegMeal();
        Meal nonVegMeal = MealBuilder.prepareNonVegMeal();

        System.out.println("蔬菜套餐：");
        vegMeal.showItems();
        System.out.println("总价：" + vegMeal.getCost());
        System.out.println();
        System.out.println("鸡肉套餐：");
        nonVegMeal.showItems();
        System.out.println("总价：" + nonVegMeal.getCost());
    }
}
