class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>>result;
        vector<int>subset;
        createSubset(0,nums,subset,result);
        return result;
    }
    void createSubset(int i,vector<int>& nums,vector<int>& subset,vector<vector<int>>&result){
            if(i==nums.size()){
                result.push_back(subset);
                return;
            }
            createSubset(i+1,nums,subset,result);
            subset.push_back(nums[i]);
            createSubset(i+1,nums,subset,result);
            subset.pop_back();
        }

};
