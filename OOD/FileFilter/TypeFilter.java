package OOD.FileFilter;

public class TypeFilter implements FileFilter {
    String type;

    public TypeFilter(String type) {
        this.type = type;
    };

    @Override
    public boolean evaluate(File file) {
        if (file.type.equals(type)) {
            return true;
        }
        return false;
    }
}
