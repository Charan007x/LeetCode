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
    public void recoverTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        fun(root,list);
        Collections.sort(list);
        int id[]=new int[1];
        ans(root,list,id);
    }
    public static void fun(TreeNode root,List<Integer> list){
        if(root==null) return;
        fun(root.left,list);
        list.add(root.val);
        fun(root.right,list);
    }
    public static void ans(TreeNode root,List<Integer> list,int id[]){
        if(root==null) return;
        ans(root.left,list,id);
        root.val=list.get(id[0]++);
        ans(root.right,list,id);
    }
}