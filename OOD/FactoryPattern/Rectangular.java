package OOD.FactoryPattern;

public class Rectangular extends Shape {
    public Rectangular() {
        super("Rectangular");
    }

    @Override
    public void draw() {
        System.out.println("Draw: " + shapeName);
    }
}
