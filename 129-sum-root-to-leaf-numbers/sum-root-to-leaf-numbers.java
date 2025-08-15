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
    public int sumNumbers(TreeNode root) {
        int ans[] = new int[1];
        ans[0]=0;
        treesum(root,0,ans);
        return ans[0];
    }
    public static void treesum(TreeNode root,int temp,int []ans){
        if(root==null) return;
        temp=(temp*10)+root.val;
     if(root.left==null&&root.right==null){
            ans[0]+=temp;
        }
        treesum(root.left,temp,ans);
        treesum(root.right,temp,ans);
    }
}