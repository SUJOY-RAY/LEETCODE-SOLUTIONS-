class Solution {
public:
    int adder(int num){
        int sum=0;
        while(num>0){
            int unit=num%10;
            sum+=unit;
            num/=10;
        }
        return sum;
    }

    int addDigits(int num) {
        if(num==0){
            return 0;
        }

        while(num%10!=num){
            num=adder(num);
        }      
        return num;
    }
};
