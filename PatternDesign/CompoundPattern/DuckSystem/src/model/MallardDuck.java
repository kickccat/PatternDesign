package model;

public class MallardDuck implements Quackable {

    Observable observable;
    private String name;

    public MallardDuck() {
        observable = new Observable(this);
        this.name = "Mallard Duck";
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
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
