package OOD.FactoryPattern;

public class Circle extends Shape {
    public Circle() {
        super("Circle");
    }

    public void draw() {
        System.out.println("Draw: " + shapeName);
    }
}
