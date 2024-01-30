import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (numIndices.containsKey(complement)) {
                return new int[]{numIndices.get(complement), i};
            }

            numIndices.put(num, i);
        }
        return new int[0];
    }
}
