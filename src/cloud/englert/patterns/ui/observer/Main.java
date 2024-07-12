package cloud.englert.patterns.ui.observer;

public class Main {
    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable(42);
        Observer observer = new ConcreteObserver();
        observable.addObserver(observer);

        observable.setValue(43);

        observable.removeObserver(observer);
    }
}
