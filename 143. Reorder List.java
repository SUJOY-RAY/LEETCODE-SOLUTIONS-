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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ArrayList<ListNode> nodes = new ArrayList();
        ListNode temp = head;
        while (temp != null) {
            nodes.add(temp);
            temp = temp.next;
        }
        int i = 0, j = nodes.size() - 1;
        while (i < j) {
            ListNode next = nodes.get(i).next;
            nodes.get(i).next = nodes.get(j);
            nodes.get(j).next = next;
            i++;
            j--;
        }
        nodes.get(i).next = null;
    }
}
