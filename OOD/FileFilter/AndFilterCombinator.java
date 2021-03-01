package OOD.FileFilter;

public class AndFilterCombinator implements FilterCombinator {
    // And Filter
    @Override
    public boolean evaluate(boolean left, boolean right) {
        return left && right;
    }
}
