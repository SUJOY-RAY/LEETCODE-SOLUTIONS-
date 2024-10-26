class Solution {
public:
    vector<int> constructRectangle(int area) {
        vector<int> arr;
        int side1=0,side2=0;
        int sq=sqrt(area);
        for(int i=1;i<=sq;i++){
            if(area%i==0){
                side1=i;
                side2=area/i;
            }
        }
        arr.push_back(side2);
        arr.push_back(side1);
        return arr;
    }
};
