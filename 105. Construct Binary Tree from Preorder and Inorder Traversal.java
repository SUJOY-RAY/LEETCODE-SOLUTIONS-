// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  * int val;
//  * TreeNode left;
//  * TreeNode right;
//  * TreeNode() {}
//  * TreeNode(int val) { this.val = val; }
//  * TreeNode(int val, TreeNode left, TreeNode right) {
//  * this.val = val;
//  * this.left = left;
//  * this.right = right;
//  * }
//  * }
//  */
// class Solution {
//     private HashMap<Integer, Integer> inorderIndexMap;
//     private int preorderIndex;

//     public TreeNode buildTree(int[] preorder, int[] inorder) {
//         inorderIndexMap = new HashMap<>();
//         preorderIndex = 0;

//         for (int i = 0; i < inorder.length; i++) {
//             inorderIndexMap.put(inorder[i], i);
//         }

//         return constructTree(preorder, 0, inorder.length - 1);
//     }

//     private TreeNode constructTree(int[] preorder, int left, int right) {
//         if (left > right)
//             return null;
//         int rootValue = preorder[preorderIndex++];
//         TreeNode root = new TreeNode(rootValue);
//         int rootIndex = inorderIndexMap.get(rootValue);
//         root.left = constructTree(preorder, left, rootIndex - 1);
//         root.right = constructTree(preorder, rootIndex + 1, right);

//         return root;

//     }
// }

class Solution {
    private int i = 0;
    private int p = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, Integer.MIN_VALUE);
    }

    private TreeNode build(int[] preorder, int[] inorder, int stop) {
        if (p >= preorder.length) {
            return null;
        }
        if (inorder[i] == stop) {
            ++i;
            return null;
        }

        TreeNode node = new TreeNode(preorder[p++]);
        node.left = build(preorder, inorder, node.val);
        node.right = build(preorder, inorder, stop);
        return node;
    }
}
