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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode temp = head;
        int nl = left-1;

        while(nl>0){
            temp = temp.next;
            nl--;
        }
        
        Stack<Integer> stack = new Stack<>();
        ListNode start = temp;
        int count = right - left + 1;   
        while(count>0){
            stack.push(temp.val);
            temp = temp.next;
            count--;
        }       

        ListNode temp2 = start;
        while(!stack.isEmpty()){
            temp2.val = stack.pop();
            temp2 = temp2.next;
        }
        return head;
    }
}
