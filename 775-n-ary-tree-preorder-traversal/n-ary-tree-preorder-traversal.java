/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();
        fun(root,list);
        return list;
    }
    public static void fun(Node root,List<Integer> list){
        if(root==null) return;
        List<Node> x=root.children;
        list.add(root.val);
        for(int i=0;i<x.size();i++){
            fun(x.get(i),list);
        }
    }
}