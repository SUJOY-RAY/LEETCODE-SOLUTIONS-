class Solution {
public:
    int minDeletionSize(vector<string>& strs) {
        int counter=0;
        int numRows = strs.size();
        int numCols = strs[0].size();

        for(int i=0;i<numCols;i++){
            for(int j=1;j<numRows;j++){
                if(strs[j][i]<strs[j-1][i]){
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
};
