class Solution {
    public int minimumEffort(int[][] tasks) {

        Arrays.sort(tasks, (a, b) ->
            (b[1] - b[0]) - (a[1] - a[0])
        );

        int ans = 0;
        int curr = 0;

        for (int[] t : tasks) {
            int actual = t[0];
            int minimum = t[1];

            if (curr < minimum) {
                ans += (minimum - curr);
                curr = minimum;
            }
            curr -= actual;
        }

        return ans;
    }
}
