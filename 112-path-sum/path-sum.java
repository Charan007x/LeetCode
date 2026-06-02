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
    public boolean hasPathSum(TreeNode root, int tar) {
        if(root==null) return false;
        return fun(root,0,tar);
    }
    public static boolean fun(TreeNode root,int sum,int tar){
        if(root==null) return false;
        if(root.left==null&&root.right==null) return (sum+root.val==tar);
        boolean left=fun(root.left,sum+root.val,tar);
        boolean right=fun(root.right,sum+root.val,tar);
        return left||right;
    }
}