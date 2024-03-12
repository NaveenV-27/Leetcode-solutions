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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            int sum = 0;
            ListNode at = curr;
            while(at != null) {
                sum += at.val;
                if(sum == 0) {
                    if(prev != null) {
                        prev.next =  at.next;
                    } else {
                        head = at.next;
                    }
                }
                at = at.next;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;  
    }
}
