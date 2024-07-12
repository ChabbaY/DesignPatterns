package cloud.englert.patterns.ui.observer;

import java.util.LinkedList;
import java.util.List;

public class ConcreteObservable implements Observable {
    private int value;
    private final List<Observer> observers;
    public ConcreteObservable(int value) {
        this.value = value;
        observers = new LinkedList<>();
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
