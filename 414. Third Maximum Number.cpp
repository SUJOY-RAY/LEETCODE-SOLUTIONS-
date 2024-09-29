class Solution {
public:
    int thirdMax(vector<int>& nums) {
        // set<int> uniqueNums(nums.begin(),nums.end());
        // vector<int>result(uniqueNums.begin(),uniqueNums.end());

        // if(result.size()<3){
        //     return result.back();
        // }else{
        //     return result[result.size()-3];
        // }

        long largest=LONG_MIN,slargest=LONG_MIN,tlargest=LONG_MIN;
        set<int> uniqueNums(nums.begin(),nums.end());
        
        for(int a:uniqueNums){
            if(a>largest){
                tlargest=slargest;
                slargest=largest;
                largest=a;
            }else if(a>slargest){
                tlargest=slargest;
                slargest=a;
            }else if(a>tlargest){
                tlargest=a;
            }
        }
        return tlargest==LONG_MIN?largest:tlargest;
    }
};
