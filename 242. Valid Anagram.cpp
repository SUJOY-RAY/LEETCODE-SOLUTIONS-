class Solution {
public:
    bool isAnagram(string s, string t) {
        map<char,int> charCountS;
        map<char,int> charCountT;
        if(s.size()!=t.size()){
            return false;
        }
        for(int i=0;i<t.size();i++){
            charCountS[s[i]]++;
            charCountT[t[i]]++;
        }
        return charCountS==charCountT;

    }
};
