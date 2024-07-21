class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        if(nums.size()==1){
            return nums[0];
        }
        int maxCurrent=nums[0];
        int maxGlobal=nums[0];
        for(int i=1;i<nums.size();i++){
            maxCurrent=max(nums[i],maxCurrent+nums[i]);
            maxGlobal=max(maxGlobal,maxCurrent);
        }
    return maxGlobal;
    }
};
