package model;

import service.NullIterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.println("(v)");
        } else {
            System.out.println();
        }
        System.out.print("   --  " + getDescription());
        System.out.println(", " + getPrice());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
