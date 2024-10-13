// // Brute Force
// class Solution {
// public:
//     int numTrees(int n) {
//         if(n<=1) return 1;
//         int ans=0;
//         for(int i=1;i<=n;i++){
//             ans+=numTrees(i-1)*numTrees(n-i);
//         }
//         return ans;
//     }
// };

// // Dynamic Programming - Memoization
// class Solution {
// public:
//     int numTrees(int n) {
//         int dp[20]{};
//         if(n<=1){
//             return 1;
//         }
//         if(dp[n])return dp[n];
//         for(int i=1;i<=n;i++){
//             dp[n]+=numTrees(i-1)*numTrees(n-i);
//         }
//         return dp[n];
//     }
// };

// // DP-Tabulation
// class Solution {
// public:
//     int numTrees(int n) {
//         vector<int> dp(n+1);
//         dp[0] = dp[1] = 1;
//         for(int i = 2; i <= n; i++) 
//             for(int j = 1; j <= i; j++)
//                 dp[i] += dp[j-1] * dp[i-j];
//         return dp[n];
//     }
// };





// Catalan numbers method
class Solution {
public:
    long ncr(int n, int r) {
        long ans=1;
        for(int i=0;i<r;i++){
            ans*=n-i;
            ans/=i+1;
        }
        return ans;
    }
    int numTrees(int n){
        return ncr(2*n,n)/(n+1);
    }
};
