class Solution {
public:
    int countSubarrays(vector<int>& nums) {
        int counter = 0, n = nums.size();

        for (int i = 0; i < n - 2; i++) {
            // if (2 * (nums[i] + nums[i + 2]) == nums[i + 1]) {
            //     counter++;
            // }
            counter += 2*(nums[i] + nums[i+2]) == nums[i+1];
        }
        return counter;
    }
};
