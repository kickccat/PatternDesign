package model;

public class GooseAdapter implements Quackable {

    Observable goose;
    private String name;

    public GooseAdapter() {
        this.goose = new Observable(this);
        this.name = "Goose";
    }

    public void honk() {
        System.out.println("Honk");
    }

    @Override
    public void quack() {
        this.honk();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        goose.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        goose.notifyObservers();
    }
}
