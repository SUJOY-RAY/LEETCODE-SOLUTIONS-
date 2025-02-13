/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         if (root == null) {
//             return true;
//         }
//         Stack<TreeNode> stack = new Stack<>();
//         TreeNode pre = null;
//         while (root != null || !stack.isEmpty()) {
//             while (root != null) {
//                 stack.push(root);
//                 root = root.left;
//             }
//             root = stack.pop();
//             if (pre != null && root.val <= pre.val) {
//                 return false;
//             }
//             pre = root;
//             root = root.right;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, long min, long max) {
        if (node == null)
            return true;

        if (node.val <= min || node.val >= max)
            return false;
        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }
}
