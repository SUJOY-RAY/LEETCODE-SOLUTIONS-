// class Solution {
// public:
//     vector<int> findDisappearedNumbers(vector<int>& nums) {
//         unordered_set<int> s(nums.begin(),nums.end());
//         vector<int>ans(nums.size()-s.size());
//         for(int i=1, j=0;i<=nums.size();i++){
//             if(s.count(i)==0){
//                 ans[j++]=i;
//             }
//         }
//         return ans;
//     }
// };




class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<int>ans;
        for(int i=1;i<=nums.size();i++){
            if(!binary_search(nums.begin(),nums.end(),i)){
                ans.push_back(i);
            }
        }
        return ans;
    }
};


