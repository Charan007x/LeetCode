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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int lvl=0;
        int prev=0,curr=0;
        while(q.size()>0){
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null)  q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                if(i==0) curr=temp.val;
                if(i>0){
                    prev=curr;
                    curr=temp.val;
                }
                if((lvl%2==0&&temp.val%2==0)||(lvl%2!=0&&temp.val%2!=0)) return false;
                if(lvl>0&&i>0){
                    if(lvl%2==1&&prev<=curr) return false;
                    if(lvl%2==0&&prev>=curr) return false;
                }
            }
            lvl++;
        }
        return true;
    }
}