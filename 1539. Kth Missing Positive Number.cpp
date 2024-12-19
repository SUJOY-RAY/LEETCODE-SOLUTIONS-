class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        int prev = 0;
        for (int i = 0; i < arr.size(); i++) {
            int missingInRange = arr[i] - prev - 1;
            if (k <= missingInRange) {
                return prev + k;
            }
            k -= missingInRange;
            prev = arr[i];
        }
        return arr.back() + k;
    }
};
