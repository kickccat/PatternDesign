package service;

import model.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator {

    private ArrayList<MenuItem> menuItems;
    private int position;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return !menuItems.isEmpty() && position < menuItems.size();
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position += 1;
        return menuItem;
    }
}
