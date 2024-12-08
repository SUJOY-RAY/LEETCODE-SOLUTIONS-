class Solution {
public:
    int hammingDistance(int x, int y) {
        int xorResult=x^y;
        int counter=0;

        while(xorResult>0){
            counter+=xorResult&1;
            xorResult>>=1;
        }
        return counter;
    }
};

// class Solution {
// public:
//     int hammingDistance(int x, int y) {
//         vector<int> num1, num2;
//         int counter = 0;
//         while (x > 0) {
//             num1.insert(num1.begin(), x % 2);
//             x /= 2;
//         }
//         while (y > 0) {
//             num2.insert(num2.begin(), y % 2);
//             y /= 2;
//         }
//         while (num1.size() < num2.size())
//             num1.insert(num1.begin(), 0);
//         while (num2.size() < num1.size())
//             num2.insert(num2.begin(), 0);

//         for (int i = 0; i < num1.size(); i++) {
//             if (num1[i] != num2[i]) {
//                 counter++;
//             }
//         }
//         return counter;
//     }
// };
