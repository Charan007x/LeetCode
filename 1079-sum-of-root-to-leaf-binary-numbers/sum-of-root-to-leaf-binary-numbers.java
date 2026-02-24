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
    public int sumRootToLeaf(TreeNode root) {
        int a[]=new int[1];
        a[0]=0;
        fun(root,"",a);
        return a[0];
    }
    public static void fun(TreeNode root,String s,int a[]){
        if(root==null) return;
        s=s+root.val;
        if(root.left==null&&root.right==null){
            a[0]=a[0]+(Integer.parseInt(s,2));
        }
        fun(root.left,s,a);
        fun(root.right,s,a);
    }
}