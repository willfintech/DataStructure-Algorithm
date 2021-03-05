package OOD.FactoryPattern;

public class PaintApp {
    public Shape draw(ShapeType shapeType) {
        Shape shape = ShapeFactory.getShape(shapeType);
        shape.draw();
        return shape;
    }

    public void fill(Shape shape, ColorType colorType) {
        Color color = ColorFactory.getColor(colorType);
        color.fill();
    }

    public void paint(ShapeType shapeType, ColorType colorType) {
        Shape shape = draw(shapeType);
        fill(shape, colorType);
    }

    public static void main(String[] args) {
        // Paint a Red Circle
        PaintApp app = new PaintApp();
        Shape shape1 = app.draw(ShapeType.CIRCLE);
        app.fill(shape1, ColorType.Red);

        // Paint a Blue Triangle
        Shape shape2 = app.draw(ShapeType.TRIANGLE);
        app.fill(shape2, ColorType.Blue);

        // Paint a Green Rectangular Directly
        app.paint(ShapeType.RECTANGULAR, ColorType.Green);
    }
}
