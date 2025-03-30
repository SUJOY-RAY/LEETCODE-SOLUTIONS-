class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int n1 = word1.size(), n2 = word2.size();
        int n = min(n1, n2);

        string result = "";
        for (int i = 0; i < n; i++) {
            result+=word1[i];
            result+=word2[i];
        }
        if (n1 == n2) {
            return result;
        } else if (n1 > n2) {
            for (int i = n; i < n1; i++) {
                result += word1[i];
            }
        } else {
            for (int i = n; i < n2; i++) {
                result += word2[i];
            }
        }
        return result;
    }
};
