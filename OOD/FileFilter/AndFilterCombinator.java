package OOD.FileFilter;

public class AndFilterCombinator implements FilterCombinator {
    @Override
    public boolean evaluate(boolean left, boolean right) {
        return left && right;
    }
}
