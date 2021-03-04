package OOD.FactoryPattern;

public class DrawApp {
    public void draw(ShapeType shapetype) {
        Shape shape = ShapeFactory.getShape(shapetype);
        shape.draw();
    }

    public static void main(String[] args) {
        DrawApp app = new DrawApp();
        app.draw(ShapeType.CIRCLE);
        app.draw(ShapeType.TRIANGLE);
        app.draw(ShapeType.RECTANGULAR);
    }
}
