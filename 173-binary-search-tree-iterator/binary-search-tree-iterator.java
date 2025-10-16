/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    private List<TreeNode> res;
    private int index;

    public BSTIterator(TreeNode root) {
        res = new ArrayList<>();
        index = 0;
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        res.add(root);
        inorder(root.right);
    }

    public int next() {
        return res.get(index++).val;
    }

    public boolean hasNext() {
        return index < res.size();
    }
}
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */