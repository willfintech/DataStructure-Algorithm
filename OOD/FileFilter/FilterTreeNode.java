package OOD.FileFilter;

// Tree:
//              &&
//          /         \
//  CreatorFilter      &&
//                   /    \
//            SizeFilter SuffixFilter

// TreeNode有两种含义：1. 逻辑：&& or ||; 2. FilterType
// 如何去Enforce这个互斥的逻辑：利用Constructor，把逻辑用不同的Constructor加以区分
// Operator TreeNode Constructor
// public TreeNode(Operator operator, TreeNode left, TreeNode right) {
//      // 因为operator子树必须为FilterType，所以要确定left和right不能为null，可以接operator，也可以接fileFilter，类似calculator
// }

// Operator也可以抽象为interface，题目变种设计运算符可以更好的利用这个特性
// Interface Operator {
//     abstract boolean combine(FileFilter ff1, FileFilter ff2);
// }

public class FilterTreeNode {
    private FilterCombinator filterCombinator;
    private FileFilter fileFilter;
    private FilterTreeNode left, right;

    // Since the FilterTreeNode can only be either a FilterCombinator and FileFilter, so it's mutual exclusive.
    // 2 Constructors represent 2 types of FilterTreeNode, 1 for FilterCombinator, 1 for FileFilter
    public FilterTreeNode(FilterCombinator filterCombinator, FilterTreeNode left, FilterTreeNode right) {
        // left and right must not be Null
        this.filterCombinator = filterCombinator;
        this.left = left;
        this.right = right;
    }

    // If input is just fileFilter, the left and right children will be enforced to set to be Null.
    public FilterTreeNode(FileFilter fileFilter) {
        this.fileFilter = fileFilter;
        this.left = null;
        this.right = null;
    }

    // methods
    public boolean evaluate(File file, FilterTreeNode root) {
        if (root == null) {
            return true;
        }
        // 2 Situations
        // both children are null, so it's a fileFilter
        if (root.left == null && root.right == null) {
            return root.fileFilter.evaluate(file);
        }

        if (root.left != null && root.right != null) {
            return root.filterCombinator.evaluate(evaluate(file, root.left), evaluate(file, root.right));
        }

        throw new IllegalArgumentException("FilterTree Construction Issues");
    }
}
