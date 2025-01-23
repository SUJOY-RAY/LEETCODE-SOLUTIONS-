class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i=0;
        int j=nums.size();
        for(int k=0;k<j;k++){
            if(nums[k]!=0){
                swap(nums[i],nums[k]);
                i++;
            }
        }
    }
};
