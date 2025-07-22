class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        int left = 0, right = 0;
        int currSum = 0, maxSum = 0;

        while(right<nums.length){
            while(unique.contains(nums[right])){
                unique.remove(nums[left]);
                currSum-=nums[left];
                left++;
            }
            unique.add(nums[right]);
            currSum+=nums[right];
            maxSum = Math.max(maxSum, currSum);
            right++;
        }
        return maxSum;
    }
}
