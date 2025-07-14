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
        int count = 0;
        ListNode curr = head;
        while(curr != null) {
            count++;
            curr = curr.next;
        }
        System.out.println(count);
        int res = 0;
        curr = head;
        while(curr != null) {
            if(curr.val == 1) {
                res += Math.pow(2, count-1);
                System.out.println(res);  
            }
            count--;
            curr = curr.next;
        }
        return res;
    }
}
