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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        fun(root,list,"");
        return list;
    }
    public static void fun(TreeNode root,List<String> list,String s){
        if(root==null) return;
        if(root.left==null&&root.right==null){
            StringBuilder sb=new StringBuilder(s);
            sb.append(root.val);
            list.add(sb.toString());
        }
        StringBuilder sb = new StringBuilder(s);
        sb.append(root.val);
        sb.append("->");
        s=sb.toString();
        fun(root.left,list,s);
        fun(root.right,list,s);
    }
}