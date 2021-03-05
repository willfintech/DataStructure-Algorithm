package OOD.FactoryPattern;

public class Green extends Color {
    public Green() {
        super("Green");
    }

    @Override
    public void fill() {
        System.out.println("Fill: " + colorName);
    }
}
