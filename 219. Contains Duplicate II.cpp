class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_map<int, int> countmap;
        for (int i = 0; i < nums.size(); i++) {
            int a = nums[i];
            if (countmap.find(a) != countmap.end() && i - countmap[a] <= k) {
                return true;
            }
            countmap[a] = i;
        }
        return false;
    }
};
