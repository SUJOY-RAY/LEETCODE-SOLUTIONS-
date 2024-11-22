/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> result;
        if (root == nullptr) {
            return result;
        }
        queue<TreeNode*> myQueue;
        myQueue.push(root);
        while (!myQueue.empty()) {
            int n = myQueue.size();
            vector<int> temp;
            for (int i = 0; i < n; i++) {
                TreeNode* node = myQueue.front();
                myQueue.pop();
                if (node->left != nullptr) {
                    myQueue.push(node->left);
                }
                if(node->right!=nullptr){
                    myQueue.push(node->right);
                }
                temp.push_back(node->val);
            }
            result.push_back(temp);
        }
        return result;
    }
};
