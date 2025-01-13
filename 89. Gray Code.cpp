class Solution {
public:
    vector<int> grayCode(int n) {
        vector<int> gray;
        for(int i=0;i<pow(2,n);i++){     //pow(2,n) same as 1<<n
            gray.push_back(i^i>>1);      //i>>1 means i/2, bitwise right shift operation
        }
        return gray;
    }
};
