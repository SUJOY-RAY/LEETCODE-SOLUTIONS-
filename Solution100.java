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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){//if both are null then return true
            return true;
        }
        if(p==null||q==null){//if onr is null and other is not then return false
            return false;
        }
        return p.val==q.val && isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);
        //resursively check if the values of the two nodes are same recursively checks if they are both/alternatively null
    }
}
