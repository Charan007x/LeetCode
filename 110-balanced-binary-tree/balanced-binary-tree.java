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
    public static class pair{
        int height;
        boolean bal;
        pair(int height,boolean bal){
            this.height=height;
            this.bal=bal;
        }
    }
    public boolean isBalanced(TreeNode root) {
        pair ans=fun(root);
        return ans.bal;
    }
    public static pair fun(TreeNode root){
        if(root==null) return new pair(0,true);
        pair left=fun(root.left);
        pair right=fun(root.right);
        boolean flag=Math.abs(left.height-right.height)<=1;
        return new pair((1+Math.max(left.height,right.height)),(flag&&left.bal&&right.bal));
    }
}