class Solution {
public:
    string clearDigits(string s) {
        string result;
        for(char a: s){
            if(isdigit(a)&&!result.empty()){    //if(a>='0'||a<='9')
                result.pop_back();
            }
            else{
                result.push_back(a);
            }
        }
        return result;
    }
};
