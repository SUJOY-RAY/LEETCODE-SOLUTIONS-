class Solution {
public:
    int minBitFlips(int start, int goal) {
        int xorResult = start ^ goal;
        int counter = 0;

        while (xorResult > 0) {
            counter += xorResult & 1;
            xorResult >>= 1;
        }
        return counter;
    }
};

// class Solution {
// public:
//     int minBitFlips(int start, int goal) {
//         vector<int> num1, num2;
//         int counter = 0;

//         while (start > 0) {
//             num1.insert(num1.begin(), start % 2);
//             start /= 2;
//         }
//         while (goal > 0) {
//             num2.insert(num2.begin(), goal % 2);
//             goal /= 2;
//         }
//         while (num1.size()< num2.size())
//             num1.insert(num1.begin(), 0);
//         while (num2.size() < num1.size())
//             num2.insert(num2.begin(), 0);

//         for (int i = num1.size() - 1; i >= 0; i--) {
//             if (num1[i] != num2[i]) {
//                 counter++;
//             }
//         }
//         return counter;
//     }
// };
