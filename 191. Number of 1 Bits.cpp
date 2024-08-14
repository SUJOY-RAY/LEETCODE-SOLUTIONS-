class Solution {
public:
    int hammingWeight(int n) {
        int binaryNum[32];
        int counter=0;
        while(n>0){
            int temp=n%2;
            if (temp==1) counter++;
            n/=2;
        }
        return counter;
    }
};
