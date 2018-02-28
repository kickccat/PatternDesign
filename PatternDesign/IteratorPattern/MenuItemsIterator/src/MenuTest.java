import model.*;

public class MenuTest {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Dinner menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert");

        MenuComponent allMenus = new Menu("All menus", "composite");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scramled eggs and toast",true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausage",false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes with fresh blueberries",true,3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles with blueberries or strawberries",true,3.59));
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara sauce", true, 3.99));
        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true,2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false,3.99));
        dinerMenu.add(new MenuItem("Soup of the day", "Soup with a side of potato salad", false,3.29));
        dinerMenu.add(new MenuItem("Hotdog", "Hot dog with saurkraut, relish, onion topped with cheese", false,2.95));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple pie", "topped with vanilla ice cream", true, 1.49));

        cafeMenu.add(new MenuItem("Veggie Burger and air fries", "on a whole wheat bun, lettuce, " +
                        "tomato",true,
                2.99));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "Soup with a side of potato salad", false,
                3.29));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
