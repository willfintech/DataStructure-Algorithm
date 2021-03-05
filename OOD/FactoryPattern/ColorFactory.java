package OOD.FactoryPattern;

public class ColorFactory {
    public static Color getColor(ColorType colorType) {
        switch(colorType) {
            case Red:
                return new Red();
            case Blue:
                return new Blue();
            case Green:
                return new Green();
            default:
                throw new IllegalArgumentException("Unsupported color type.");
        }
    }
}
