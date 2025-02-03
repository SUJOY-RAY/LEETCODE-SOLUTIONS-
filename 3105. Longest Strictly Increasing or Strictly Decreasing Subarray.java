class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int n = nums.length;
        int maxI = 1, maxD = 1;
        int currI = 1, currD = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                currI++;
                currD = 1;
            } else if (nums[i] < nums[i - 1]) {
                currD++;
                currI = 1;
            } else {
                currI = 1;
                currD = 1;
            }

            maxI = Math.max(maxI, currI);
            maxD = Math.max(maxD, currD);
        }

        return Math.max(maxI, maxD);
    }
}
