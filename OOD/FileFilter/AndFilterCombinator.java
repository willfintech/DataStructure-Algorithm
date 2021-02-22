package OOD.FileFilter;

public class AndFilterCombinator implements FilterCombinator {
    @Override
    public boolean evaluate(FileFilter filter1, FileFilter filter2) {
        if (filter1.evaluate() && filter2.evaluate()) {
            return true;
        }
        return false;
    }
}
