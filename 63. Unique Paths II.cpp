class Solution {
public:
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        int m=obstacleGrid.size();
        int n=obstacleGrid[0].size();

        if(obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        vector<int>dp(n,0);
        dp[0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[j]=0;
                }else if(j>0){
                    dp[j]+=dp[j-1];
                }
            }
        }
        return dp[n-1];
    }
};

/*
Given grid:
            [0, 0, 0]
            [0, 1, 0]
            [0, 0, 0]

Make a dp array initialized with zeroes.  
       dp[]=[0, 0, 0]

Set the starting position dp[0], the first element to 1.
            [1, 0, 0]

Traverse the grid row by row. 
    If the jth element the ith row in grid is 1,
        Set the jth element of the dp array to zero.
    else if j>0
        Add the exacty above jth element to the dp array's jth index.  
*/
