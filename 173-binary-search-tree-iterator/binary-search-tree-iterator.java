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
class BSTIterator {
    List<Integer> list;
    int pt;
    public BSTIterator(TreeNode root) {
        list=new ArrayList<>();
        pt=0;
        fun(root,list);
    }
    public static void fun(TreeNode root,List<Integer> list){
        if(root==null) return;
        fun(root.left,list);
        list.add(root.val);
        fun(root.right,list);
    }
    public int next() {
        int x=list.get(pt);
        pt++;
        return x;
    }
    
    public boolean hasNext() {
        if(pt<=list.size()-1) return true;
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */