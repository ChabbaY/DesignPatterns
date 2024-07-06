package cloud.englert.patterns.creation.factorymethod;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing a rectangle ...");
    }
}
