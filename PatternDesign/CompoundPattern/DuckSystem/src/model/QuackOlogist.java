package model;

public class QuackOlogist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quack Ologist: " + duck.getName() + " just quacked.");
    }
}
