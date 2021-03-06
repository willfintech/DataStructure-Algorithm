package OOD.FileFilter;

import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Create Files
        File file1 = new File("file1",
                50,
                "txt",
                "Wilson",
                new Date(System.currentTimeMillis()));

        File file2 = new File("file2",
                75,
                "png",
                "Wilson",
                new Date(System.currentTimeMillis()));

        File file3 = new File("file2",
                150,
                "txt",
                "Wilson",
                new Date(System.currentTimeMillis()));

        SizeFilter sizeLess100 = new SizeFilter(100, "<");
        TypeFilter typeIsTxt = new TypeFilter("txt");
        AndFilterCombinator and = new AndFilterCombinator();
        FilterTreeNode root = new FilterTreeNode(and, new FilterTreeNode(sizeLess100), new FilterTreeNode(typeIsTxt));
        System.out.println(root.evaluate(file1, root));
        System.out.println(root.evaluate(file2, root));
        System.out.println(root.evaluate(file3, root));
    }
}
