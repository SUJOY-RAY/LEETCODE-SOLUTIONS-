class Solution {
public:
    int titleToNumber(string columnTitle) {
        int result=0;
        for(char a:columnTitle){
            int value=a-'A'+1;
            result=result*26+value;
        }
        return result;
    }
};
