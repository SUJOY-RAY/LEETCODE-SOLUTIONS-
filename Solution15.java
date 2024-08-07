import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int total = nums[i] + nums[l] + nums[r];

                if (total < 0) {
                    l++;
                } else if (total > 0) {
                    r--;
                } else {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[l], nums[r]);
                    result.add(triplet);

                    while (l < r && nums[l] == triplet.get(1))
                    {
                        l++;
                    }

                    while (l < r && nums[r] == triplet.get(2))
                    {
                        r--;
                    }
                }
            }
        }
        return result;
    }
}
