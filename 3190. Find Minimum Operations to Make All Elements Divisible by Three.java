class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;

        for(int a: nums) {
            if(a % 3 != 0){
                operations++;
            }
        }
        return operations;
    }
}
