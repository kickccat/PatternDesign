package service;

import model.*;

public class CaliPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliCheesePizza();
        }
        else if (type.equals("veggie")) {
            return new CaliVeggiePizza();
        }
        else if (type.equals("clam")) {
            return new CaliClamPizza();
        }
        else if (type.equals("pepperoni")) {
            return new CaliPepperoniPizza();
        }
        else {
            return null;
        }
    }
}
