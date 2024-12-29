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



 /*
        Stack Method
 */

class Solution {
public:
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int>traversal;
        stack<TreeNode*>stack;
        TreeNode* current=root;

        while(current!=nullptr||!stack.empty()){
            while(current!=nullptr){
                stack.push(current);
                current=current->left;
            }
            
            current=stack.top();
            stack.pop();
            traversal.push_back(current->val);

            current=current->right;

        }
        return traversal;
    }
};


 /*
        Faster recursion method 
 */


// class Solution {
// public:
//     vector<int> traversal;
//     vector<int> inorderTraversal(TreeNode* root) {
//         if(!root){
//             return traversal;
//         }
//         inorderTraversal(root->left);
//         traversal.push_back(root->val);
//         inorderTraversal(root->right);

//         return traversal;
//     }
// };


 /*
        Slower recursion method
 */


// class Solution {
// public:
//     void helper(TreeNode* root, vector<int>&traversal){
//         if(root==nullptr){
//             return;
//         }
//         helper(root->left,traversal);
//         traversal.push_back(root->val);
//         helper(root->right,traversal);
//     }
//     vector<int> inorderTraversal(TreeNode* root) {
//         vector<int> traversal;
//         helper(root,traversal);
//         return traversal;
//     }
// };
