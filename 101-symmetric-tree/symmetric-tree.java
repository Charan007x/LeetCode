class Solution {
    public boolean isSymmetric(TreeNode root) {
        return fun(root.left,root.right);
    }
    public static boolean fun(TreeNode l,TreeNode r){
        if(l==null&&r==null) return true;
        if((l==null&&r!=null)||(l!=null&&r==null)) return false;
        boolean left = fun(l.left,r.right);
        boolean right = fun(l.right,r.left);
        boolean flag = (l.val!=r.val)?false:true;
        return left&&right&&flag;
    }
}