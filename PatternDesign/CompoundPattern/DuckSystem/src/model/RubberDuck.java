package model;

public class RubberDuck implements Quackable {

    Observable observable;
    private String name;

    public RubberDuck() {
        this.observable = new Observable(this);
        this.name = "Rubber Duck";
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
