package model;

import model.Observer;

public interface QuackObservable {

    String getName();
    void registerObserver(Observer observer);
    void notifyObservers();
}
