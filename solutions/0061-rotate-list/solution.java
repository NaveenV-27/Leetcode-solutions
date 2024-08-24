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
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        int size = 1;
        while(curr.next != null) {
            size++;
            curr = curr.next;
        }
        curr.next = head;
        curr = head;
        ListNode prev = curr;
        for(int i=1; i<=size-(k%size); i++) {
            prev = curr;
            curr = curr.next;

        }
        prev.next = null;
        return curr;
    }
}
