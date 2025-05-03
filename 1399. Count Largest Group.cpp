class Solution {
public:
    int countLargestGroup(int n) {
        map<int, int> groupSizes;

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            groupSizes[sum]++;
        }

        int maxSize = 0;
        for (auto &group : groupSizes) {
            maxSize = max(maxSize, group.second);
        }

        int count = 0;
        for (auto &group : groupSizes) {
            if (group.second == maxSize) {
                count++;
            }
        }

        return count;
    }

    int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
};
