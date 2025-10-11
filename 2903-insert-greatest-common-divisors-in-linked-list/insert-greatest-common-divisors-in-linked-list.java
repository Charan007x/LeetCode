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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null){
            ListNode temp=new ListNode(gcd(slow.val,fast.val));
            temp.next=fast;
            slow.next=temp;
            slow=fast;
            fast=fast.next;
        }
        return head;
    }
    public int gcd(int x,int y){
        int a=Math.max(x,y);
        int b=Math.min(x,y);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}