package BuilderPattern;

import BuilderPattern.object.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lord_X_ on 2016/11/9.
 */
public class Meal {
    private List<Item> itemlist = new ArrayList<Item>();

    public Meal addItem(Item item) {
        itemlist.add(item);
        return this;
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : itemlist) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : itemlist) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }

    public List<Item> getItemList() {
        return itemlist;
    }
}
