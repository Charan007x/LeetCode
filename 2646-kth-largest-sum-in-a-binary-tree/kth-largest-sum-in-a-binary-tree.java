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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        long sum=0;
        int lvl=0;
        q.add(root);
        while(q.size()>0){
            int n=q.size();
            sum=0;lvl++;
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                sum+=temp.val;
            }
            list.add(sum);
        }
        if(k>list.size()) return -1;
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(k-1);
    }
}