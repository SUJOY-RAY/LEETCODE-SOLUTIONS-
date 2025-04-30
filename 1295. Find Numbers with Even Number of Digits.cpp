class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int counter = 0;

        for (int num : nums) {
            int digits = log10(num) + 1;
            if (digits % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
};
