package cloud.englert.patterns.behaviour.templatemethod;

public class Main {
    public static void main(String[] args) {
        var concrete = new Concrete();
        concrete.templateMethod();
    }
}
