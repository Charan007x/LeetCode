class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow=head;
        ListNode prev = null;
        if(head.next==null) return null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
}