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
    public ListNode mergeKLists(ListNode[] a) {
        int n=a.length;
        if(n==0) return null;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            ListNode temp=a[i];
            while(temp!=null){
                pq.add(temp.val);
                temp=temp.next;
            }
        }
        if(pq.size()==0) return null;
        ListNode head= new ListNode(pq.poll());
        ListNode x=head;
        while(pq.size()>0){
            ListNode temp=new ListNode(pq.poll());
            x.next=temp;
            x=temp;
        }
        return head;
    }
}