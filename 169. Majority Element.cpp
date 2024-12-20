class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int> counter;
        for(int a :nums){
            counter[a]++;
        }
        int majority=0;
        int maxCount=0;

        for (auto a:counter){
            if(a.second>maxCount){
                maxCount = a.second;
                majority = a.first;
            }
        }
        return majority;
    }
};



// class Solution {
// public:
//     int majorityElement(vector<int>& nums) {
//         int count=0;
//         int candidate=-1;
//         for(int num:nums){
//             if(count==0){
//                 candidate=num;
//             }
//             if(num==candidate){
//                 count++;
//             }else{
//                 count--;
//             }
//         }
//         return candidate;
//     }
// };

