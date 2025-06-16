class Solution {
    public int maximumDifference(int[] nums) {
        int minValue = nums[0];
        int minDiff = -1;

        for(int i=0;i<nums.length; i++){
            if(nums[i]>minValue){
                minDiff = Math.max(minDiff, nums[i]-minValue);
            }else{
                minValue = nums[i];
            }
        }
        return minDiff;
    }
}
