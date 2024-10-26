class Solution {
public:
    string convertToBase7(int num) {
        string result="";
        int c=0;
        if(num<0){
            num*=-1;
            c=1;
        }
        while(true){
            if(num>=7){
                int temp=num%7;
                num/=7;
                result=to_string(temp)+result;
            }
            if(num<7){
                result=to_string(num)+result;
                break;
            }
        }
        if(c==1){
            result="-"+result;
        }
        return result;
    }
};
