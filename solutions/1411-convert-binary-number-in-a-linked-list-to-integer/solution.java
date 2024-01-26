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
    public int getDecimalValue(ListNode head) {
        if(head.next == null) {
            return head.val;
        }
        int s = 0;
        ListNode curr = head;
        while(curr != null) {
            s++;
            curr = curr.next;
        }
        int n=0;
        curr = head;
        while(s>0) {
            n+=((int)Math.pow(2,s-1) * curr.val);
            curr = curr.next;
            s--;
        }
        return n;
    }
}
