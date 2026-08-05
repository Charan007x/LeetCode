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
    public int countDominantNodes(TreeNode root) {
        int ans[]=new int[1];
        ans[0]=0;
        int x=fun(root,ans);
        return ans[0];
    }
    public static int fun(TreeNode root,int ans[]){
        if(root==null) return -1;
        int left=fun(root.left,ans);
        int right=fun(root.right,ans);
        int val=Math.max(root.val,Math.max(left,right));
        if(val==root.val) ans[0]++;
        return val;
    }
}