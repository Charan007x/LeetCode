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
        return fun(root,subRoot);
    }
    public static boolean fun(TreeNode a,TreeNode b){
        if(a==null) return false;
        boolean flag=same(a,b);
        boolean left=fun(a.left,b);
        boolean right=fun(a.right,b);
        return flag||left||right;
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