import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] temp = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            temp[i][0] = nums[i]; 
            temp[i][1] = i;        
        }
        Arrays.sort(temp, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = temp[left][0] + temp[right][0];
            if (sum == target) {
                return new int[]{temp[left][1], temp[right][1]};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{};
    }
}
