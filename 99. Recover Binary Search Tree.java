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
    private TreeNode pred = null; // Previous node in inorder traversal
    private TreeNode x = null; // First misplaced 
    private TreeNode y = null; // Second misplaced

    public void recoverTree(TreeNode root) {
        inorder(root);
        swap(x, y);
    }

    public void inorder(TreeNode root){
        if(root==null){
            return;
        }

        inorder(root.left);
        
        if(pred!=null && root.val < pred.val){
            if(x==null){
                x=pred;
            }
            y=root;
        }
        pred=root;
        
        inorder(root.right);
    }
    private void swap(TreeNode a, TreeNode b) {
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }

}



// class Solution {
//     void inorder(TreeNode root, ArrayList<TreeNode> traversal){
//         if(root.left!=null){
//             inorder(root.left, traversal);
//         }
        
//         traversal.add(root);

//         if(root.right!=null){
//             inorder(root.right, traversal);
//         }

//     }
//     public void recoverTree(TreeNode root) {
//         ArrayList<TreeNode> traversal = new ArrayList<>();
//         inorder(root, traversal);
        
//         TreeNode first = null, second = null;     
//         for(int i=0;i<traversal.size()-1;i++){
//             if(traversal.get(i).val>traversal.get(i+1).val){
//                 if(first==null){
//                     first = traversal.get(i);
//                 }
//                 second = traversal.get(i+1);
//             }
//         }
//         int val = first.val;
//         first.val=second.val;
//         second.val=val;
//     }
// }

