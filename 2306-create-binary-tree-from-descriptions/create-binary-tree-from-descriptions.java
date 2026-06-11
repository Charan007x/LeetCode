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
    public TreeNode createBinaryTree(int[][] a) {
        int n=a.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++) set.add(a[i][1]);
        int par=-1;
        for(int i=0;i<n;i++){
            if(!set.contains(a[i][0])){
                par=a[i][0];
                break;
            }
        }
        HashMap<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x[]=new int[2];
            Arrays.fill(x,-1);
            if(!map.containsKey(a[i][0])) map.put(a[i][0],x);
        }
        for(int i=0;i<n;i++){
            int idx=(a[i][2]==0?1:0);
            int x[]=map.get(a[i][0]);
            x[idx]=a[i][1];
        }
        TreeNode root=create(par);
        fun(root,par,map);
        return root;
    }
    public static void fun(TreeNode root,int par,HashMap<Integer,int[]> map){
        if(!map.containsKey(par)) return;
        int x[]=map.get(par);
        if(x[0]!=-1){
            TreeNode left=create(x[0]);
            root.left=left;
            fun(left,x[0],map);
        }
        if(x[1]!=-1){
            TreeNode right=create(x[1]);
            root.right=right;
            fun(right,x[1],map);
        }
    }
    public static TreeNode create(int val){
        TreeNode t=new TreeNode(val);
        return t;
    }
}