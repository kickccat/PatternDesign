package model;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

    Hashtable menuItems;

    public CafeMenu() {
        menuItems = new Hashtable();

        addItem("Veggie Burger and air fries", "on a whole wheat bun, lettuce, tomato",true,2.99);
        addItem("Burrito", "A large burrito", true, 3.99);
        addItem("Soup of the day", "Soup with a side of potato salad", false, 3.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
