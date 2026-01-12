/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int n=list.size();
        Stack<Integer> st = new Stack<>();
        st.push(list.get(n-1));
        int ans[]=new int[n];
        for(int i=n-2;i>=0;i--){
            while(st.size()>0&&list.get(i)>=st.peek()) st.pop();
            if(st.size()>0) ans[i]=st.peek();
            st.push(list.get(i));
        }
        return ans;
    }
}