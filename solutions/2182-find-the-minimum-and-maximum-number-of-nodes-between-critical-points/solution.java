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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr = head.next;
        ListNode prev = head;
        int idx = 1;
        List<Integer> l = new ArrayList<>();
        while(curr.next != null) {
            if((curr.val > prev.val && curr.val > curr.next.val) || (curr.val < prev.val && curr.val < curr.next.val)) {
                l.add(idx);
            } 
            idx++;
            prev = curr;
            curr = curr.next;
        }
        int res[] = new int[2];
        if(l.size() < 2) {
            res[0] = -1;
            res[1] = -1;
        } else {
            int min = Integer.MAX_VALUE;
            for(int i=1; i<l.size(); i++) {
                min = Math.min(min, l.get(i)-l.get(i-1));
            }
            res[0] = min;
            res[1] = l.get(l.size()-1) - l.get(0);
        } 
        
        return res;
    }
}
