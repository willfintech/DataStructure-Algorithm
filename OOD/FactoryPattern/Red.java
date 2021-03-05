package OOD.FactoryPattern;

public class Red extends Color {
    public Red() {
        super("Red");
    }

    @Override
    public void fill() {
        System.out.println("Fill: " + colorName);
    }
}
