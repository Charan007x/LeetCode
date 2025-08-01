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
    public static class Pair{
        int height;
        boolean balornot;
        Pair(int height,boolean balornot){
            this.height=height;
            this.balornot=balornot;
        }
    }
    public boolean isBalanced(TreeNode root) {
        Pair result = fun(root);
        return result.balornot;
    }
    public static Pair fun(TreeNode root){
        if(root==null) return new Pair(0,true);
        Pair left = fun(root.left);
        Pair right = fun(root.right);
        int height = 1+Math.max(left.height,right.height);
        boolean balornot = left.balornot&&right.balornot&&(Math.abs(left.height-right.height)<=1);
        return new Pair(height,balornot);
    }
}