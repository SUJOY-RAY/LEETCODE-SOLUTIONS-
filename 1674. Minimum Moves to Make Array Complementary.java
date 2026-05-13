class Solution {
    public int minMoves(int[] nums, int limit) {
        int n = nums.length;

        // Difference array
        int[] diff = new int[2 * limit + 2];

        for (int i = 0; i < n / 2; i++) {
            int a = nums[i];
            int b = nums[n - 1 - i];

            int x = Math.min(a, b);
            int y = Math.max(a, b);

            /*
                For every sum initially cost = 2

                Then:
                [x+1, y+limit] -> cost decreases by 1
                [a+b]          -> cost decreases by 1 again
            */

            diff[2] += 2;

            // one move range starts
            diff[x + 1] -= 1;

            // zero move point
            diff[a + b] -= 1;
            diff[a + b + 1] += 1;

            // one move range ends
            diff[y + limit + 1] += 1;
        }

        int ans = Integer.MAX_VALUE;
        int curr = 0;

        for (int s = 2; s <= 2 * limit; s++) {
            curr += diff[s];
            ans = Math.min(ans, curr);
        }

        return ans;
    }
}
