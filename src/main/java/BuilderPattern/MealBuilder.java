package BuilderPattern;

import BuilderPattern.object.food.ChickenBurger;
import BuilderPattern.object.food.Coke;
import BuilderPattern.object.food.Pepsi;
import BuilderPattern.object.food.VegBurger;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class MealBuilder {

    public static Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger()).addItem(new Coke());
        return meal;
    }

    public static Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger()).addItem(new Pepsi());
        return meal;
    }
}
