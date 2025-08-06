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
    public void flatten(TreeNode root) {
        if(root==null) return;
        ArrayList<Integer> treeVal = new ArrayList<>();
        dfs(root, treeVal);
        // Collections.sort(treeVal);
        root.left = null;
        root.val = treeVal.get(0);
        TreeNode temp = root;
        for(int i=1;i<treeVal.size();i++){
            temp.right = new TreeNode(treeVal.get(i));
            temp = temp.right;
        }
    }
    public void dfs(TreeNode root, ArrayList<Integer> treeVal){
        if(root == null){
            return;
        }
        treeVal.add(root.val);
        dfs(root.left, treeVal);
        dfs(root.right, treeVal);
    }
}
