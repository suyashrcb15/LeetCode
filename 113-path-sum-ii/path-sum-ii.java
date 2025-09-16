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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        if(root.left==null && root.right==null && root.val==targetSum){
            List<Integer> path = new ArrayList<>();
            path.add(root.val);
            res.add(path);
            return res;
        }
        List<List<Integer>> leftPaths=pathSum(root.left,targetSum-root.val);
        for(List<Integer> path:leftPaths){
            path.add(0,root.val);
            res.add(path);
        }
        List<List<Integer>> rightPaths=pathSum(root.right,targetSum-root.val);
        for(List<Integer> path:rightPaths){
            path.add(0, root.val);
            res.add(path);
        }
        return res;
    }
}