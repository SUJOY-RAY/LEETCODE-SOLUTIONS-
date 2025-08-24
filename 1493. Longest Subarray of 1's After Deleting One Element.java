class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxLength = Integer.MIN_VALUE;
        int currLength = 0;
        int prevLength = 0;
        boolean removed = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                currLength++;
            } else {
                removed = true;
                maxLength = Math.max(maxLength, prevLength + currLength);
                prevLength = currLength;
                currLength = 0;
            }
        }
        maxLength = Math.max(maxLength, prevLength + currLength);
        return removed ? maxLength : n - 1;
    }
}
