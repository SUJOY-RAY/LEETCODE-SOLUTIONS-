class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
        int doubleCount=0,singleCount=0;
        for(int a:nums){
            if((a/10)>0){
                doubleCount+=a;
            }else{
                singleCount+=a;
            }
        }
        if (doubleCount!=singleCount){
            return true;
        }else{
            return false;
        }
    }
};
