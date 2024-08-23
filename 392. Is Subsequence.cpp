class Solution {
public:
    bool isSubsequence(string s, string t) {
        int counter=0;
        int n=s.size();
        int m=t.size();
        int i=0;
        for(int j=0;j<m;j++){
            if (i==n) return true;
            if(t[j]==s[i]){
                i++;
            }
        }
        return i==n;
    }
};
