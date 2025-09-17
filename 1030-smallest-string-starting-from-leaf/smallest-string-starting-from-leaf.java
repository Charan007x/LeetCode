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
    public String smallestFromLeaf(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        fun(root,list,"");
        Collections.sort(list);
        return list.get(0);
    }
    public static void fun(TreeNode root,List<String> list,String s){
        if(root==null) return;
        StringBuilder sb = new StringBuilder(s);
        int x=root.val+97;
        char ch=(char)x;
        sb.append(ch);
        s=sb.toString();
        if(root.left==null&&root.right==null){
            StringBuilder temp = new StringBuilder(s);
            list.add(temp.reverse().toString());
        }
        fun(root.left,list,s);
        fun(root.right,list,s);
    }
}