package cloud.englert.patterns.creation.factorymethod;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}