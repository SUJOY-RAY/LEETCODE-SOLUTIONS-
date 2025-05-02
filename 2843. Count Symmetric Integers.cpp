class Solution {
public:
    int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int num = low; num <= high; num++) {
            if (isSymm(num)) {
                count++;
            }
        }
        return count;
    }

    bool isSymm(int number) {
        // String-based logic (commented out):
        /*
        string numStr = to_string(number);
        int len = numStr.size();

        if (len % 2 != 0) {
            return false;
        }

        int half = len / 2;
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < half; i++) {
            leftSum += numStr[i] - '0';
            rightSum += numStr[half + i] - '0';
        }

        return leftSum == rightSum;
        */

        // Arithmetic-based implementation:
        int len = 0, temp = number;
        while (temp > 0) {
            temp /= 10;
            len++;
        }

        if (len % 2 != 0) return false;

        int half = len / 2;
        int leftSum = 0, rightSum = 0;
        temp = number;

        // Sum right half
        for (int i = 0; i < half; i++) {
            rightSum += temp % 10;
            temp /= 10;
        }

        // Sum left half
        for (int i = 0; i < half; i++) {
            leftSum += temp % 10;
            temp /= 10;
        }

        return leftSum == rightSum;
    }
};
