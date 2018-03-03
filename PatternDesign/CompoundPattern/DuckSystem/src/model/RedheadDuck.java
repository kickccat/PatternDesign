package model;

public class RedheadDuck implements Quackable {

    Observable observable;
    private String name;

    public RedheadDuck() {
        this.observable = new Observable(this);
        this.name = "Redhead Duck";
    }

    public String getName() {
        return name;
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
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
