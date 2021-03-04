package OOD.FactoryPattern;

// Why Using Factory Pattern?
// When we have an interface with common features to create objects, and we don't want to expose the logic of the creation

public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
            case RECTANGULAR:
                return new Rectangular();
            default:
                throw new IllegalArgumentException("Unsupported shape type.");
        }
    }
}
