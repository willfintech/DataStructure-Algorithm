package OOD.FactoryPattern;

public abstract class Color {
    protected String colorName;

    public Color(String colorName) {
        this.colorName = colorName;
    }

    public abstract void fill();
}
