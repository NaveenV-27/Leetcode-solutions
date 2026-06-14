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
    public int pairSum(ListNode head) {
        if(head.next.next == null) {
            return (head.val + head.next.val);
        }
        
        int n = 0;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            n++;
        }
        // System.out.println(n);
        int i = 0;
        curr = head;
        int max = 0;
        List<Integer> l = new ArrayList<>();
        while(curr != null) {
            if(i < (n/2)) {
                l.add(curr.val);
            } else {
                int pair = curr.val + l.get(n-i-1);
                // System.out.println(i + ", " + (n-i));
                max = Math.max(pair, max);
            }
            curr = curr.next;
            i++;
        }
        return max;
    }
}
