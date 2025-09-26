public class Solution {
    public int ClimbStairs(int n) {
        if(n==0||n==1){
            return 1;
        }

        List<int> dp = new List<int>();
        dp.Add(1);
        dp.Add(1);

        for(int i = 2; i <= n; i++){
            dp.Add(dp[i-1] + dp[i-2]);
        }
        return dp[n];
    }
}
