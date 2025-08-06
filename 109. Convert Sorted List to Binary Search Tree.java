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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> nodes = new ArrayList<>();
       
        while(temp != null){
            nodes.add(temp.val);
            temp = temp.next;
        }
        return buildBST(nodes, 0, nodes.size() - 1);
    }
    private TreeNode buildBST(ArrayList <Integer> nodes, int left, int right){
        if(left > right){
            return null;
        }
        int i = 0, j = nodes.size();
        int mid = (left + right) / 2;
        TreeNode tree = new TreeNode(nodes.get(mid));

        tree.left = buildBST(nodes, left, mid - 1);
        tree.right = buildBST(nodes, mid+1, right);

        return tree;
    }
}
