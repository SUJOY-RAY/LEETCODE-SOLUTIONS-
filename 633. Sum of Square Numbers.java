// class Solution {
//     public boolean judgeSquareSum(int c) {
//         int left = 0;
//         int right = (int) Math.sqrt(c);

//         while (left <= right) {
//             long result = (long) left * left + (long) right * right;
//             if (result == c) {
//                 return true;
//             } else if (result < c) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 2; i * i <= c; i++) {
            int count = 0;

            while (c % i == 0) {
                count++;
                c /= i;
            }

            if (i % 4 == 3 && count % 2 != 0) {
                return false;
            }
        }

        return c % 4 != 3;
    }
}
