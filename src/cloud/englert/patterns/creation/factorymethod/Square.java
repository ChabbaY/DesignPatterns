package cloud.englert.patterns.creation.factorymethod;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing a square ...");
    }
}
