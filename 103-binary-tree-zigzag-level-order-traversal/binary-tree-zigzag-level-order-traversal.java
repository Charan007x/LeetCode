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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null) q.add(root);
        int count=0;
        while(q.size()>0){
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp = q.poll();
                list.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            if(count%2==1){
                int l=0,h=list.size()-1;
                while(l<h){
                    int t = list.get(l);
                    list.set(l,list.get(h));
                    list.set(h,t);
                    l++;h--;
                }
            }
            ans.add(list);
            count++;
        }
        return ans;
    }
}