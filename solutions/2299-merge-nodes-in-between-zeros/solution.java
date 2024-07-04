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
        int sum = 0;
        ListNode newHead = new ListNode(0);
        ListNode nl = newHead;
        ListNode curr = head.next;
        while(curr != null) {
            if(curr.val == 0 && sum > 0) {
                if(newHead.val == 0) {
                    newHead.val += sum;
                } else {
                    nl.next = new ListNode(sum);
                    nl = nl.next;
                }
                sum = 0;
            } else {
                sum += curr.val;
            }
            curr = curr.next;
        }
        return newHead;
    }
}
