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
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int max=Integer.MIN_VALUE,lvl=1,ans=0;
        while(q.size()>0){
            int sz=q.size(),sum=0;
            for(int i=0;i<sz;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                sum+=temp.val;
            }
            if(sum>max){
                max=sum;
                ans=lvl;
            }
            lvl++;
        }
        return ans;
    }
}