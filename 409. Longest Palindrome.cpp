class Solution {
public:
    int longestPalindrome(string s) {
        map<char,int> data; 
        for(int i=0;i<s.length();i++){
            data[s[i]]++;
        }
        int length=0;
        bool oddFound=false;

        for(auto& entry: data){
            int count=entry.second;
            if(count%2==0){
                length+=count;
            }else{
                length+=count-1;
                oddFound=true;
            }
        }
        if(oddFound){
            length++;
        }
        return length;
    }
};
