package cloud.englert.patterns.creation.factorymethod;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new RectangleFactory();
        Shape shape = factory.getShape();
        shape.draw();
    }
}
