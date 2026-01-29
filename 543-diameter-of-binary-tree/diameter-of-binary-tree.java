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
        int dia;
        pair(int height,int dia){
            this.height=height;
            this.dia=dia;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        pair ans=fun(root);
        return ans.dia;
    }
    public static pair fun(TreeNode root){
        if(root==null) return new pair(-1,0);
        pair left=fun(root.left);
        pair right=fun(root.right);
        int lh=left.height;
        int rh=right.height;
        int max=2+lh+rh;
        return new pair(1+Math.max(lh,rh),Math.max(max,Math.max(left.dia,right.dia)));
    }
}