class Solution {
public:
    string frequencySort(string s) {
        string result = "";
        map<char, int> counter;

        for (char c : s) {
            counter[c]++;
        }

        vector<pair<char, int>> orderedByValues(counter.begin(), counter.end());

        sort(orderedByValues.begin(), orderedByValues.end(), 
             [](const pair<char, int>& a, const pair<char, int>& b) {
                 return a.second > b.second; 
             });

        for (auto& it : orderedByValues) {
            result.append(it.second, it.first);
        }

        return result;
    }
};
