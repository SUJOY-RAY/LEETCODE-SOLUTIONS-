class Solution {

public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int>result(nums.size());
        int i=0,j=1;
        for(int a:nums){
            if(a>0){
                result[i]=a;
                i+=2;
            }else if(a<0){
                result[j]=a;
                j+=2;
            }
        }
        return result;
    }
};
