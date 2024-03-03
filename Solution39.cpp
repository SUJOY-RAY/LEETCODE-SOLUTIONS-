class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>>comb;
        generateCombination(0, candidates, vector<int>(), comb, target );
        return comb;
    }

    void generateCombination(int start, vector<int>&nums, vector<int>current,vector<vector<int>>&com,int target ){

if(target==0){
        com.push_back(current);
        return;
}    
if(target<0){
    return;
}
    for(int i=start;i<nums.size();i++){
            current.push_back(nums[i]);
            generateCombination(i, nums, current, com, target-nums[i] );
            current.pop_back();
        }
    }
    
};
