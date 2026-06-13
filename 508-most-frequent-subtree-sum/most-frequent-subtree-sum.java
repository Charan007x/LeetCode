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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int x=fun(root,map);
        int maxf=0;
        for(int key:map.keySet()){
            maxf=Math.max(map.get(key),maxf);
        }
        List<Integer> list=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==maxf) list.add(key);
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++) ans[i]=list.get(i);
        return ans;
    }
    public static int fun(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null) return 0;
        int left=fun(root.left,map);
        int right=fun(root.right,map);
        int sum=left+right+root.val;
        map.put(sum,map.getOrDefault(sum,0)+1);
        return sum;
    }
}