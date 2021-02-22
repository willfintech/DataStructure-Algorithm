package OOD.FileFilter;

// 实际上，这里的File Filter处理的不是实际文件，一般是MetaData

// Requirement: 1. Different types of file filters; 2. Combine multiple file filters.
// Solutions: 1. 多态继承；2.Construct a Tree, LeafNodes as the Filter, if all LeafNodes return true

public interface FileFilter {
    abstract boolean evaluate(File file);
}

// 使用的时候要做到：
// FileFilter ff = new sizeFilter(100, "<=");
// SuffuxFilter ff = new suffixFilter("txt");
// void foo(FileFilter)

// BuilderPattern
// filterPraram和BuilderPattern的区别:
// 随记：Abstract可以有Constructor但是不能实例化
