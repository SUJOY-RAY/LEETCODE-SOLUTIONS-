class Solution {
    public int[] getConcatenation(int[] nums) {
        int newNums[]=new int[2*nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            newNums[i]=nums[i];
            newNums[i+n]=nums[i];
        }
        return newNums;
    }
}
