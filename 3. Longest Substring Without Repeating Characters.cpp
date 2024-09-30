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
