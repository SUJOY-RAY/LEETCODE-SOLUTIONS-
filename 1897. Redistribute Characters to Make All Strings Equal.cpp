class Solution {
public:
    bool
    makeEqual(vector<string>& words) { // Using a method similar to Countsort
        vector<int> counter(26);
        int n = words.size();
        for (string word : words) {
            for (char a : word) {
                counter[a - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (counter[i] % n != 0) {
                return false;
            }
        }
        return true;
    }
};

// class Solution {
// public:
//     bool makeEqual(vector<string>& words) {
//         map<char,int>charCount;
//         for(int i=0;i<words.size();i++){
//             for(auto& a:words[i]){
//                 charCount[a]++;
//             }
//         }
//         int numWords = words.size();
//         for(auto& pair:charCount){
//             if(pair.second%numWords!=0){
//                 return false;
//             }
//         }
//         return true;
//     }
// };
