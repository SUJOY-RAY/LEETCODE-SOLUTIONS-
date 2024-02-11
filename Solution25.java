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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        int count = 0;

        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        if (count == k) {
            ListNode reversedHead = reverseKGroup(current, k); 

            current = head;
            ListNode prev = null;
            while (count > 0) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count--;
            }

            head.next = reversedHead;

            return prev; 
        }

        return head; 
    }
}
