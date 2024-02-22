class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int a=0;a<nums.length;a++){
            if(nums[a]==target){
                return a;
            }
            else if(nums[a]>target){
                return a;
            }
        }
        return nums.length;
    }
}
