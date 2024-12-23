class Solution {
private:
//Dynamic Programming
    int expandAroundCenter(string& s, int left, int right) {
        while (left >= 0 && right < s.size() && s[left] == s[right]) {
            left--;
            right++;
        }
        return right - left - 1;
    }

public:
    string longestPalindrome(string s) {
        if (s.empty())
            return "";
        int n = s.size();
        int start = 0, maxLength = 0;
        for (int i = 0; i < n; i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substr(start, maxLength);
    }
};

// class Solution {

// private:
//     bool isPalindrome(string s, int i, int j){
//         int left=i;
//         int right=j-1;
//         while(left<right){
//             if(s[left]!=s[right]){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

// public:
//     string longestPalindrome(string s) {
//         int n=s.size();
//         if (n == 0) return "";
//         for(int length=n;length>0;length--){
//             for(int start=0;start<=n-length;start++){
//                 if (isPalindrome(s, start, start + length)) {
//                     return s.substr(start, length);
//                 }
//             }
//         }
//         return "";
//     }
// };

// class Solution {

// // Brute Force
// private:
//     bool isPalindrome(string s) {
//         string rev = s;
//         reverse(rev.begin(), rev.end());
//         return rev == s;
//     }

// public:
//     string longestPalindrome(string s) {
//         int n = s.size();
//         if (n == 0) {
//             return "";
//         }
//         string longest = s.substr(0, 1);
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 string subString = s.substr(i, j - i + 1);
//                 if (isPalindrome(subString) &&
//                     subString.size() > longest.size()) {
//                     longest = subString;
//                 }
//             }
//         }
//         return longest;
//     }
// };
