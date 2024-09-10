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
    private int gcd(int a, int b) {
        while(b != 0) {
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr.next != null) {
            curr.next = new ListNode(gcd(curr.val, curr.next.val), curr.next);
            curr = curr.next.next;
        }
        return head;
    }
}
