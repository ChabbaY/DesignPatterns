package cloud.englert.patterns.ui.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("The value changed");
    }
}
