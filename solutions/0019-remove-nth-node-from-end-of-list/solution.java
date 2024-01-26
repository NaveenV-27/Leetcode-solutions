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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int ids = size-n;
        if(ids == 0) {
            return head.next;
        }
        ListNode prev = head;
        for(int k=1; k<ids; k++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}
