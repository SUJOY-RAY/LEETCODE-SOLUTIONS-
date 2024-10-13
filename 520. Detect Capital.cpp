class Solution {
public:
    bool detectCapitalUse(string word) {
        if(all_of(word.begin(),word.end(),::islower)||
           all_of(word.begin(),word.end(),::isupper)){
            return true;
           }
        if(isupper(word[0])&&all_of(word.begin()+1,word.end(),::islower)){
            return true;
        }
        return false;
    }
};


// class Solution {
// public:
//     bool detectCapitalUse(string word) {
//         int n = word.length();
//         bool a = false;
//         // Check if the first letter is capital
//         if (isupper(word[0])) {
//             if (n > 1 && isupper(word[1])) {
//                 a = true;
//             }
//         }

//         for (int i = 1; i < n; i++) {
//             // if the first letter is lower
//             if (a == false) {
//                 if (isupper(word[i])) {
//                     return false;
//                 }
//             }
//             // if the first letter is upper
//             else {
//                 if (islower(word[i])) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// };
