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
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        return helper(nums, 0,nums.size()-1);
    }

    TreeNode* helper(vector<int>& nums, int low, int high){
        if(low<=high){
            int mid=low+(high-low)/2;
            TreeNode* root=new TreeNode(nums[mid]);
            root->left=helper(nums, low, mid-1);
            root->right=helper(nums, mid+1, high);
            return root;
        }
        return NULL;
    }
};





// class Solution {
// private:
//     TreeNode* recursiveBSTForm(vector<int>nums,int start, int end){
//         if(start>end){
//             return nullptr;
//         }
//         int mid=start+(end-start)/2;
//         TreeNode* root=new TreeNode(nums[mid]);
//         root->left=recursiveBSTForm(nums,start,mid-1);
//         root->right=recursiveBSTForm(nums,mid+1,end);
//         return root;
//     }
// public:
//     TreeNode* sortedArrayToBST(vector<int>& nums) {
//         int n=nums.size();
//         return recursiveBSTForm(nums,0,n-1);
//         /*
//             nums: The vector used.
//             arg1: The starting index.
//             arg2: The ending index.
//         */
//     }
// };
