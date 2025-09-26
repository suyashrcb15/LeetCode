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
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        for(int i=0;i<ans.size();i++){
            for(int j=i+1;j<ans.size();j++){
                if(ans.get(i)+ans.get(j)==k){
                    return true;
                }
            }
        }
        return false;
    }
    public void inorder(TreeNode root, ArrayList<Integer> res){
        if(root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}