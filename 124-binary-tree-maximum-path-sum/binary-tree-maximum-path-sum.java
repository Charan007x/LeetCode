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
        int sum;
        int max;
        pair(int sum,int max){
            this.sum=sum;
            this.max=max;
        }
    }
    public int maxPathSum(TreeNode root) {
        return fun(root).max;
    }
    public static pair fun(TreeNode root){
        if(root==null) return new pair(0,Integer.MIN_VALUE);
        pair left=fun(root.left);
        pair right =fun(root.right);
        int ls=left.sum;
        int rs=right.sum;
        return new pair(Math.max(0,root.val+Math.max(ls,rs)),Math.max(root.val,Math.max(root.val+ls,Math.max(root.val+rs,(Math.max(root.val+ls+rs,Math.max(left.max,right.max)))))));
    }
}