class Solution {
public:
    vector<int> resultsArray(vector<int>& nums, int k) {
        int n=nums.size();
        vector<int>result(n-k+1,-1);
        int i=0,j=0;
        while(j<n){
            if(j>0&&nums[j]-nums[j-1]!=1){
                i=j;
            }
            while(i<j&&j-i+1>k){
                i++;
            }
            if(j-i+1==k){
                result[j-k+1]=nums[j];
            }
            j++;
        }
        return result;
        // int n = nums.size();
        // vector<int> result;
        // for (int i = 0; i <= n - k; i++) {
        //     vector<int> subarray(nums.begin() + i, nums.begin() + i + k);
        //     unordered_set<int> seen(subarray.begin(), subarray.end());
        //     if (is_sorted(subarray.begin(), subarray.end()) &&
        //         (subarray.back() - subarray.front() == k - 1) &&
        //         (subarray.size() == seen.size())) {
        //         result.push_back(subarray.back());
        //     }
        //     else {
        //         result.push_back(-1);
        //     }
        // }
        // return result;
    }
};
