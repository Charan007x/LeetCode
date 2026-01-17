/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root==null)return "";
    StringBuilder sb = new StringBuilder();
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
        TreeNode node = q.poll();
        if (node == null) {
            sb.append("null ");
            continue;
        }
        sb.append(node.val).append(" ");
        q.add(node.left);
        q.add(node.right);
    }
    return sb.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String s) {
        if (s.equals("")) return null;
    String[] a= s.split(" ");
    TreeNode root = new TreeNode(Integer.parseInt(a[0]));
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int i = 1;
    while (!q.isEmpty()) {
        TreeNode curr = q.poll();
        if (!a[i].equals("null")){
            curr.left = new TreeNode(Integer.parseInt(a[i]));
            q.add(curr.left);
        }
        i++;
        if(!a[i].equals("null")){
            curr.right = new TreeNode(Integer.parseInt(a[i]));
            q.add(curr.right);
        }
        i++;
    }
    return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));