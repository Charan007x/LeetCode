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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1= new ArrayList<>();
        fun(root1,l1);
        List<Integer> l2=new ArrayList<>();
        fun(root2,l2);
        return (l1.equals(l2));

    }
    public static void fun(TreeNode root,List<Integer> list){
        if(root==null) return;
        if(root.left==null&&root.right==null) list.add(root.val);
        fun(root.left,list);
        fun(root.right,list);
    }
}