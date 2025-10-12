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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        int count=0;
        while(count<a-1){
            temp=temp.next;
            count++;
        }
        ListNode x=temp; // start
        while(count<=b){
            temp=temp.next;
            count++;
        }
        ListNode y=temp;
        ListNode tail=list2;
        while(tail.next!=null) tail=tail.next;
        x.next=list2;
        tail.next=y;
        return list1;
    }
}