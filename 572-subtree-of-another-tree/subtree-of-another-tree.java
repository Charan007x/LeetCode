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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean flag[]=new boolean[1];
        flag[0]=false;
        fun(root,subRoot,flag);
        return flag[0];
    }
    public static void fun(TreeNode a,TreeNode b,boolean flag[]){
        if(a==null) return;
        flag[0]=flag[0]||same(a,b);
        fun(a.left,b,flag);
        fun(a.right,b,flag);
    }
    public static boolean same(TreeNode a,TreeNode b){
        if((a==null&&b!=null)||(a!=null&&b==null)) return false;
        if(a==null&&b==null) return true;
        if(a.val!=b.val) return false;
        boolean left=same(a.left,b.left);
        boolean right=same(a.right,b.right);
        return left&&right;
    }
}