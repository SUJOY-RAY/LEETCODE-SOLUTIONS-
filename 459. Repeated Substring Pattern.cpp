class Solution {
public:
    bool repeatedSubstringPattern(string s) {
        int n=s.size();
        if(n==0){
            return false;
        }
        string ss=s+s;
        string modified=ss.substr(1,ss.size()-2);

        return modified.find(s)!=string::npos;
    }
};
