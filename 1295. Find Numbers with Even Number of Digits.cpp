class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int result = 0;
        for(int num:nums){
            int count = 0;
            while(num!=0){
                num/=10;
                count++;
            }
            if((count&1)==0){
                result++;
            }
        }   
        return result;
    }
};

// class Solution {
// public:
//     int findNumbers(vector<int>& nums) {
//         int counter = 0;

//         for (int num : nums) {
//             int digits = log10(num) + 1;
//             if (digits % 2 == 0) {
//                 counter++;
//             }
//         }
//         return counter;
//     }
// };
