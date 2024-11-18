class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s.empty()){
            return 0;
        }
        int longest=0;
        unordered_map<int,int> occurences;
        int left=0;
        for(int right=0;right<s.size();++right){
            char currChar=s[right];
            if(occurences.find(currChar)!=occurences.end()&&occurences[currChar]>=left){
                left=occurences[currChar]+1;
            }
            occurences[currChar]=right;
            longest=max(longest,right-left+1);
        }
        return longest;
    }
};

// class Solution {
// public:
//     int lengthOfLongestSubstring(string s) {
//         int n=s.size();
//         unordered_set<int> seen;
//         int maxLength=0;
//         int start=0;

//         for(int end=0;end<n;++end){
//             while(seen.find(s[end])!=seen.end()){
//                 seen.erase(s[start]);
//                 start++;
//             }
//             seen.insert(s[end]);
//             maxLength=max(maxLength,end-start+1);
//         }
//         return maxLength;
        
//     }
// };
