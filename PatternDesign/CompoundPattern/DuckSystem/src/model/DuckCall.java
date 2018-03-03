package model;

public class DuckCall implements Quackable {

    Observable observable;
    private String name;

    public DuckCall() {
        this.observable = new Observable(this);
        this.name = "Duck call";
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
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
