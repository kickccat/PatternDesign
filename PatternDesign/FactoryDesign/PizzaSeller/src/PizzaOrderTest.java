import model.Pizza;
import service.CaliPizzaStore;
import service.NYPizzaStore;
import service.PizzaStore;

public class PizzaOrderTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore caliStore = new CaliPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("John ordered a " + pizza.getName() + "\n");

        pizza = caliStore.orderPizza("cheese");
        System.out.println("Joey ordered a " + pizza.getName() + "\n");
    }
}
