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
        int max;
        int dia;
        pair(int max,int dia){
            this.max=max;
            this.dia=dia;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return fun(root).dia;
    }
    public static pair fun(TreeNode root){
        if(root==null) return new pair(-1,0);
        pair left=fun(root.left);
        pair right=fun(root.right);
        int lh=left.max;
        int rh=right.max;
        return new pair((1+Math.max(lh,rh)),(Math.max(2+lh+rh,Math.max(left.dia,right.dia))));
    }
}