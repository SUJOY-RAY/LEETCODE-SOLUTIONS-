class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minPos = 0, maxPos = 0;

        // Find positions of minimum and maximum
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minPos]) {
                minPos = i;
            }

            if (nums[i] > nums[maxPos]) {
                maxPos = i;
            }
        }

        // Make minPos the smaller index
        int left = Math.min(minPos, maxPos);
        int right = Math.max(minPos, maxPos);

        // Three possible ways:
        // 1. Remove both from the front
        int fromFront = right + 1;

        // 2. Remove both from the back
        int fromBack = n - left;

        // 3. Remove one from each side
        int fromBothSides = (left + 1) + (n - right);

        return Math.min(fromFront, Math.min(fromBack, fromBothSides));
    }
}
