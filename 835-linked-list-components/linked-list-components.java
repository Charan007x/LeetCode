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
    public int numComponents(ListNode head, int[] a) {
        ListNode slow=head;
        ListNode fast=head.next;
        int count=0;
        HashSet<Integer> set = new HashSet<>();
        int n = a.length;
        for(int i=0;i<n;i++) set.add(a[i]);
        while(fast!=null){
            if(set.contains(slow.val)&&!set.contains(fast.val)) count++;
            slow=slow.next;
            fast=fast.next;
        }
        if(set.contains(slow.val)&&fast==null) count++;
        return count;
    }
}