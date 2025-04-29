class Solution {
public:
    long long countSubarrays(vector<int>& nums, int k) {
        int left = 0;
        long long counter = 0;
        int n = nums.size();

        int max_Val = *max_element(nums.begin(), nums.end());
        int currCount = 0;

        for (int right = 0; right < n; right++) {

            if (nums[right] == max_Val) {
                currCount++;
            }
            while (currCount >= k) {
                counter += (n - right);
                if (nums[left] == max_Val) {
                    currCount--;
                }
                left++;
            }
        }
        return counter;
    }
};
