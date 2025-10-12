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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode ans = null;
        ListNode tail=null;
        while(temp!=null){
            int x=0;
            while(temp.val!=0){
                x+=temp.val;
                temp=temp.next;
            }
            ListNode y = new ListNode(x);
            if(ans!=null){
                tail.next=y;
                tail=y;
            }
            else{
                ans=y;
                tail=ans;
            }
            temp=temp.next;
        }
        return ans;
    }
}