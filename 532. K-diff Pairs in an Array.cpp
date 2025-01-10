class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if (k < 0) return 0; 
        unordered_map<int, int> freq;
        for (int num : nums) {
            freq[num]++;
        }

        int counter = 0;
        for (auto& [num, count] : freq) {
            if (k == 0) {
                if (count > 1) counter++;
            } else {
                if (freq.count(num + k)) counter++;
            }
        }
        
        return counter;
    }
};
