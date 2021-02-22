package OOD.FileFilter;

public class SizeFilter implements FileFilter {
    private final int size;
    private final String relationalOperator;  // 如何处理，operator为char，'<'的情况

    public SizeFilter(int size, String relationalOperator) {
        this.size = size;
        this.relationalOperator = relationalOperator;
    }

    @Override
    public boolean evaluate(File file) {
        switch (this.relationalOperator) {
            case "<":
                if (file.size < this.size) {
                    return true;
                }
                return false;
            case "<=":
                if (file.size <= this.size) {
                    return true;
                }
                return false;
            case "==":
                if (file.size == this.size) {
                    return true;
                }
                return false;
            case "!=":
                if (file.size != this.size) {
                    return true;
                }
                return false;
            case ">=":
                if (file.size >= this.size) {
                    return true;
                }
                return false;
            case ">":
                if (file.size > this.size) {
                    return true;
                }
                return false;
            default: throw new IllegalArgumentException();
        }
    }
}
