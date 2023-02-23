import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }


public class BSTIterator {
    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        pushToStack(root);
    }

    public int next() {
        TreeNode tmp = stack.pop();
        pushToStack(tmp.right);
        return tmp.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void pushToStack(TreeNode root)
    {
        while (root != null) {
            stack.add(root.left);
            root = root.left;
        }
    }
}
