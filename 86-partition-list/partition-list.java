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
    public ListNode partition(ListNode head, int x) {
        if(head==null) return head;
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x) a.add(temp.val);
            else b.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        int k=0;
        while(temp!=null&&k<a.size()){
            temp.val=a.get(k);
            k++;
            temp=temp.next;
        }
        k=0;
        while(temp!=null&&k<b.size()){
            temp.val=b.get(k);
            k++;
            temp=temp.next;
        }
        return head;
    }
}