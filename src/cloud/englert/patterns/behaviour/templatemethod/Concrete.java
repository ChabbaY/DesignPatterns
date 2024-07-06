package cloud.englert.patterns.behaviour.templatemethod;

public class Concrete extends Template {
    @Override
    public void operation1() {
        System.out.print("A");
    }

    @Override
    public void operation2() {
        System.out.print("B");
    }
}
