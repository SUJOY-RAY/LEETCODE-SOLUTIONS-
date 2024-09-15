class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(),[](
            const vector<int>& a,const vector<int>& b){
                return a[0]<b[0];
            });
        vector<vector<int>>merged;
        vector<int>prev=intervals[0];

        for(int i=0;i<intervals.size();i++){
            vector<int> current_interval=intervals[i];
            if(current_interval[0]<=prev[1]){
                prev[1]=max(prev[1],current_interval[1]);
            }else{
                merged.push_back(prev);
                prev=current_interval;
            }
        }
        merged.push_back(prev);
        return merged;
    }
};
