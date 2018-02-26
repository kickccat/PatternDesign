package model;

import service.PancakeHouseIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scramled eggs and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles with blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}