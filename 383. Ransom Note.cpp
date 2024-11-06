class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        int alphabetsCount[26]={0};
        for(auto chr:magazine){
            alphabetsCount[chr-'a']++;
        }
        for(auto chr:ransomNote){
            if(alphabetsCount[chr-'a']){
                alphabetsCount[chr-'a']--;
            }else{
                return false;
            }
        }   
        return true;
    }
};




// class Solution {
// public:
//     bool canConstruct(string ransomNote, string magazine) {
//         map<char,int>ransomCount;
//         map<char,int>magCount;

//         for(char a:ransomNote){
//             ransomCount[a]++;
//         }
        
//         for(char a:magazine){
//             magCount[a]++;
//         }
        
//         for (auto& entry : ransomCount) {
//             char ch = entry.first;
//             int ransomCharCount = entry.second;
            
//             if (magCount[ch] < ransomCharCount) {
//                 return false;
//             }
//         }
        
//         return true;

//     }
// };
