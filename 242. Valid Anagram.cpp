class Solution {
public:
    // //Sorting method
    // bool isAnagram(string s, string t) {
    //     sort(s.begin(),s.end());
    //     sort(t.begin(),t.end());
    //     return s==t;
    // }

    // //Hashmap method
    // bool isAnagram(string s, string t) {
    //     if (s.length() != t.length()) return false;
    //     map<char, int> countMap;
    //     for (char a : s) {
    //         countMap[a]++;
    //     }
    //     for (char c : t) {
    //         if (countMap.find(c) == countMap.end())
    //             return false;
    //         countMap[c]--;
    //         if (countMap[c] < 0)
    //             return false;
    //     }
    //     return true;
    // }

    // array method
    bool isAnagram(string s, string t) {
        if (s.length() != t.length())
            return false;
        int countArr[26] = {0};
        for (int i = 0; i < s.length(); i++) {
            countArr[s[i] - 'a']++;
            countArr[t[i] - 'a']--;
        }
        for (int a : countArr) {
            if (a != 0) {
                return false;
            }
        }
        return true;
    }
};
