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
    public ListNode removeNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp =head;
        while(temp!=null){
        list.add(temp.val);
        temp=temp.next;
        }
        int n=list.size();
        int b[]=new int[n];
        Stack<Integer> st =new Stack<>();
        st.push(list.get(n-1));
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty()&&list.get(i)>=st.peek()) st.pop();
            if(st.size()>0) b[i]=st.peek();
            st.push(list.get(i));
        }
        ListNode ans=new ListNode(0);
        temp=ans;
        for(int i=0;i<n;i++){
            if(b[i]==0){
                ListNode x=new ListNode(list.get(i));
                temp.next=x;
                temp=x;
            }
        }
        return ans.next;
    }
}