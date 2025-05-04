class Solution {
public:
    int numEquivDominoPairs(vector<vector<int>>& dominoes) {
        map<pair<int, int>, int> mp;
        int counter = 0;

        for(auto& dompair:dominoes){
            int a = max(dompair[0], dompair[1]), b = min(dompair[0], dompair[1]);
            counter += mp[{a, b}];
            mp[{a,b}]++;
        }
    return counter;
    }
};
