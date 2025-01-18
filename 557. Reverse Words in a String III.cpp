

class Solution {
public:
    string reverseWords(string s) {
        vector<string> splitString;
        string result="";
        int slow=0;
        for(int fast=0;fast<=s.size();fast++){
            if(fast==s.size()||s[fast]==' '){
                splitString.push_back(s.substr(slow, fast-slow));
                slow=fast+1;
            }
        }
        for(string a:splitString){
            reverse(a.begin(), a.end());
            result+=a+" ";
        }
        if(!result.empty()){
            result.pop_back();
        }
        return result;
    }
};


// class Solution {
// public:
//     string reverseWords(string s) {
//         int left=0;
//         for(int i=1;i<=s.size();i++){
//             if(i==s.size()||s[i]==' '){
//                 int right=i-1;
//                 while(left<right){
//                     swap(s[left],s[right]);
//                     left++;
//                     right--;
//                 }
//                 left=i+1;
//             }
//         }
//         return s;
//     }
// };
