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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list1;
        int s1 = 1;
        int s2 = 0;
        while(temp2.next != null && s2 < b) {
            if(s1 < a) {
                temp1 = temp1.next;
                s1++;
            }
            temp2 = temp2.next;
            s2++;
        }
        ListNode lnode = temp2.next;
        temp2.next = null;
        temp1.next = list2;
        ListNode temp = list2;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = lnode;
        return list1;
    }
}
