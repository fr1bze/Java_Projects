class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }
 }



public class SubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return false;
        if (isIdentical(root, subRoot))
            return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isIdentical(TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            return node1 == null && node2 == null;
        }
        return
                node1.val == node2.val &&
                        isIdentical(node1.left, node2.left) &&
                        isIdentical(node1.right, node2.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4,new TreeNode(5,new TreeNode(3),new TreeNode(6)),new TreeNode(4));
        TreeNode subTree = new TreeNode(5,new TreeNode(3),new TreeNode(6));
        SubTree tree = new SubTree();
        System.out.println(tree.isSubtree(treeNode,subTree));
    };
}

