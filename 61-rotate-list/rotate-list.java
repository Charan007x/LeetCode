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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        int n = size(head);
        k=k%n;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        temp=head;
        int count=0;
        while(count<n-k-1){
            temp=temp.next;
            count++;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
    public static int size(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}