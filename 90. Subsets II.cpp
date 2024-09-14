class Solution {
private:
    void backtrack(vector<vector<int>>& subsets, vector<int>& temp, vector<int>& nums, int start) {
        subsets.push_back(temp);
        for(int i=start;i<nums.size();++i){
            if(i>start&& nums[i]==nums[i-1])continue;
            temp.push_back(nums[i]);
            backtrack(subsets,temp,nums,i+1);
            temp.pop_back();
        }
    }

public:
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<vector<int>> subsets;
        vector<int> temp;

        sort(nums.begin(),nums.end());
        backtrack(subsets,temp,nums,0);

        return subsets;
    }
};
