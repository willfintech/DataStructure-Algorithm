package OOD.FactoryPattern;

public class Blue extends Color {
    public Blue() {
        super("Blue");
    }

    @Override
    public void fill() {
        System.out.println("Fill: " + colorName);
    }
}
