/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int sumOfLeftLeaves(TreeNode* root) {
        if(root==nullptr){
            return 0;
        }
        int leftSum=0;
        if(root->left!=nullptr&&root->left->left==nullptr&&root->left->right==nullptr){
            leftSum+=root->left->val;
        }
        leftSum+=sumOfLeftLeaves(root->left);
        leftSum+=sumOfLeftLeaves(root->right);

        return leftSum;
    }
};
