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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> result;
        if(root==nullptr){
            return result;
        }

        queue<TreeNode*> que;
        que.push(root);
        bool leftToRight=true;

        while(!que.empty()){
            vector<int>temp;
            int n=que.size();

            for(int i=0;i<n;i++){
                TreeNode* node=que.front();
                que.pop();
                temp.push_back(node->val);
                
                if (node->left != nullptr) {
                    que.push(node->left);
                }
                if (node->right != nullptr) {
                    que.push(node->right);
                }
            }
            if(!leftToRight){
                reverse(temp.begin(),temp.end());
            }
            result.push_back(temp);
            leftToRight=!leftToRight;
        }
        return result;
    }
};
