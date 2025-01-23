class Solution {
    public int findDuplicate(int[] nums) {
        // int slow = 0;
        // int fast = 0;
        // do {
        //     slow = nums[slow];
        //     fast = nums[nums[fast]];
        // } while (slow != fast);
        // slow = 0;
        // while (slow != fast) {
        //     slow = nums[slow];
        //     fast = nums[fast];
        // }
        // return slow;

        int n=nums.length;
        int[] countArr = new int[n + 1];
        for(int num:nums){
        countArr[num]++;
        }
        int result;
        for(int i=0;i<countArr.length;i++){
        if(countArr[i]>1){
        return i;
        }
        }
        return -1;
    }
}
