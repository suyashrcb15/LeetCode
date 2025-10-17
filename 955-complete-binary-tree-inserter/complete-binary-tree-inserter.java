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
class CBTInserter {
    TreeNode root;
    Queue<TreeNode> queue = new LinkedList<>();

    public CBTInserter(TreeNode root) {
        this.root = root;
        if(root == null){
            return;
        }
        Queue<TreeNode> temp = new LinkedList<>();
        temp.add(root);
        while(!temp.isEmpty()){
            TreeNode curr = temp.poll();
            if(curr.left != null){
                temp.add(curr.left);
            }
            if(curr.right != null){
                temp.add(curr.right);
            }
            if(curr.left == null || curr.right == null){
                queue.add(curr);
            }
        }
    }

    public int insert(int val) {
        TreeNode node = new TreeNode(val);
        TreeNode parent = queue.peek();
        if(parent.left == null){
            parent.left = node;
        }
        else{
            parent.right = node;
            queue.poll();
        }
        queue.add(node);
        return parent.val;
    }

    public TreeNode get_root() {
        return root;
    }
}
/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */