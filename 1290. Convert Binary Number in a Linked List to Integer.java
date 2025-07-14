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
        // Stack<Integer> stack = new Stack<>();
        // while(head != null){
        //     stack.push(head.val);
        //     head = head.next;
        // }
        // int number = 0;
        // int i = 0;

        // while(!stack.isEmpty()){
        //     number += stack.pop() * Math.pow(2, i);
        //     i++;
        // }
        // return number;

        ListNode temp = head;
        int length = length(temp);
        int number = 0;
        while(temp != null){
            number += temp.val * Math.pow(2, length-1);
            temp = temp.next;
            length--;
        }
        return number;
    }

    static int length(ListNode node){
        int l = 0;
        while(node!=null){
            l++;
            node = node.next;
        }
        return l;
    }
}
