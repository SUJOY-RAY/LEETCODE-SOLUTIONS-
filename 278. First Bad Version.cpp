// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        long long left=1, right=n;

        while(left<right){
            long long version=(left+right)/2;
            if(isBadVersion(version)){
                right=version;
            }else{
                left=version+1;
            }
        }
        return left;
    }
};
