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
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            int sz=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<sz;i++){
                Node temp=q.poll();
                List<Node> x=temp.children;
                list.add(temp.val);
                for(int j=0;j<x.size();j++){
                    q.add(x.get(j));
                }
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}