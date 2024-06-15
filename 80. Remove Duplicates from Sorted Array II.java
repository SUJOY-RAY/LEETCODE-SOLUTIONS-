class Solution {
    public int removeDuplicates(int[] nums){
        int index=1;
        int count=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if (nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if (count<=2){
                nums[index]=nums[i];
                index++;
            }


        }
        return index;
    }
}
