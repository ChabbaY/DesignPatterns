package cloud.englert.patterns.structure.adapter;

public class Main {
    public static void main(String[] args) {
        var adapter = new MathAdapter();
        var result = adapter.maximum(4, 12, 8, 5);
        System.out.println("Maximum: 12 == " + result);
    }
}
