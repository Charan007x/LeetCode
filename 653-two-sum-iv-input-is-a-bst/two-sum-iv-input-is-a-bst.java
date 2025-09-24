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
    public boolean findTarget(TreeNode root, int k) {
        boolean a[]=new boolean[1];
        a[0]=false;
        HashSet<Integer> set = new HashSet<>();
        fun(root,set,k,a);
        return a[0];
    }
    public static void fun(TreeNode root,HashSet<Integer>set,int k,boolean a[]){
        if(root==null) return;
        if(set.contains(root.val)) a[0]=true;
        set.add(k-root.val);
        fun(root.left,set,k,a);
        fun(root.right,set,k,a);
    }
}