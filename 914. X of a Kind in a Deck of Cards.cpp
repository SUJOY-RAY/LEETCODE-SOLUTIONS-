class Solution {
public:
    int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    bool hasGroupsSizeX(vector<int>& deck) {
        map<int,int> counter;
        for(int a:deck){
            counter[a]++;
        }
        int ans=0;
        vector<int>kind;
        for(auto a: counter){
            ans=gcd(a.second,ans);
        }
        return ans<2?false:true;
    }
};
