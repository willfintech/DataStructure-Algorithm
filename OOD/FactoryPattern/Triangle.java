package OOD.FactoryPattern;

public class Triangle extends Shape {
    public Triangle() {
        super("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw: " + shapeName);
    }
}
