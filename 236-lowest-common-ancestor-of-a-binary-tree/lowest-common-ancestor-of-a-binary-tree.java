/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return fun(root,p,q);
    }
    public static TreeNode fun(TreeNode root,TreeNode p,TreeNode q){
        if(root==null||root==p||root==q) return root;
        TreeNode left=fun(root.left,p,q);
        TreeNode right=fun(root.right,p,q);
        if(left!=null&&right!=null) return root;
        return (left!=null?left:right);
    }
}