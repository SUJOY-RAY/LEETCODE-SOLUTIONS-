class Solution {
public:
    string countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        string prev = countAndSay(n - 1);
        string result;

        for (int i = 0; i < prev.size();) {
            char currentDigit = prev[i];
            int count = 0;

            while (i < prev.size() && prev[i] == currentDigit) {
                ++i;
                ++count;
            }

            result += to_string(count) + currentDigit;
        }

        return result;
    }
};
