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
    public int maxLevelSum(TreeNode root) {
        int max=Integer.MIN_VALUE;
        int lvl=0,currlvl=0;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int n = q.size();
            int curr=0;
            currlvl++;
            for(int i=0;i<n;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                curr+=temp.val;
            }
            if(curr>max){
                max=curr;
                lvl=currlvl;
            }
        }
        return lvl;
    }
}