class Solution {
public:
    int maxAbsoluteSum(vector<int>& nums) {
        int maxSum=0, minSum=0, currMax=0,currMin=0;
        for(int a:nums){
            currMax=max(currMax+a,a);
            maxSum=max(maxSum, currMax);

            currMin=min(currMin+a,a);
            minSum=min(minSum,currMin);
        }
        return max(abs(maxSum),abs(minSum));
    }
};
