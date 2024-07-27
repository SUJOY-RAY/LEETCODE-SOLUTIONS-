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
    // private void helper(TreeNode node, List<Integer> result){
    //     if(node==null){
    //         return;
    //     }
    //     result.add(node.val);
    //     helper(node.left,result);
    //     helper(node.right,result);
    // } 


    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> result=new ArrayList<>();
    //     helper(root,result);
    //     return result;
    // }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        if(root==null){
            return result;
        }

        Stack<TreeNode> stack =new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            result.add(node.val);

            if(node.right!=null){
                stack.push(node.right);
            }

            if(node.left!=null){
                stack.push(node.left);
            }
        }
        return result;
    
    }



}
