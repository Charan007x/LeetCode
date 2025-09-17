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
    public List<List<Integer>> pathSum(TreeNode root, int tar) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(root,ans,tar,0,new ArrayList<>());
        return ans;
    }
    public static void fun(TreeNode root,List<List<Integer>> ans,int tar,int sum,List<Integer> list){
        if(root==null) return;
        sum=sum+root.val;
        list.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum==tar) ans.add(new ArrayList<>(list));
        }
        fun(root.left,ans,tar,sum,list);
        fun(root.right,ans,tar,sum,list);
        list.remove(list.size()-1);
    }
}