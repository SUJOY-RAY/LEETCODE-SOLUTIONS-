class Solution {
public:
    int missingNumber(vector<int>& nums) {
        // int sum=nums.size()*(nums.size()+1)/2;
        // return sum-accumulate(nums.begin(),nums.end(),0);

        int n=nums.size();
        int num=0;
        for(int i=0;i<n;i++){
            num=num^nums[i];
        }

        for(int i=1;i<=n;i++){
            num=num^i;
        }
        return num;
    }
};
