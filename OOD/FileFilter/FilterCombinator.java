package OOD.FileFilter;

public interface FilterCombinator {
    abstract boolean evaluate(FileFilter filter1, FileFilter filter2);
}
