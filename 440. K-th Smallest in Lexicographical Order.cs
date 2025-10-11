public class Solution {
    public int FindKthNumber(int n, int k) {
        int curr = 1;
        k--;

        while(k > 0) {
            long steps = GetSteps(n, curr, curr + 1);

            if(steps <= k) {
                curr++;
                k -= (int)steps;
            } else {
                curr *= 10;
                k--;
            }
        }
        return curr;
    }
    private long GetSteps(int n, long first, long last) {
        long steps = 0;

        while(first <= n) {
            steps += Math.Min(n + 1L, last) - first;
            first *= 10;
            last *= 10;
        }
        return steps;
    }
}
