class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        //// Naive approach [without inplace]
        // int[] result = new int [n];
        // Arrays.fill(result, 0);
        // for(int i = 0; i < n; i++){
        //     if(nums[i]!=0){
        //         result[j++] = nums[i];
        //     }
        // }
        // nums = result;

        //// Inplace [2 pointer]

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while(j<n){
            nums[j++] = 0;
        }
    }
}
