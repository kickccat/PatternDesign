package service;

import model.Observer;
import model.Quackable;

public class HonkCounter implements Quackable {

    Quackable goose;
    private static int numberOfHonk;

    public HonkCounter(Quackable goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.quack();
        numberOfHonk++;
    }

    @Override
    public String getName() {
        return null;
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
