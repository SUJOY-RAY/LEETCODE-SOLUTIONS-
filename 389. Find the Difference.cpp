class Solution {
public:
    char findTheDifference(string s, string t) {
        map<char,int> charMap;
        for(char a:s){
            charMap[a]++;
        }
        for(char b:t){
            charMap[b]++;
        }

        for(const auto& pair:charMap){
            if(pair.second%2!=0){
                return pair.first;
            }
        }     
        return -1;
    }
};
