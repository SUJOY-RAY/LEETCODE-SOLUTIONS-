// public class Solution {
//     public int countCompleteSubarrays(int[] nums) {
//         int distinctSubarrayCount = 0;
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             set.add(num);
//         }
//         int distinctCounter = set.size();

//         for (int i = 0; i < nums.length; i++) {
//             HashSet<Integer> currSet = new HashSet<>();
//             for (int j = i; j < nums.length; j++) {
//                 currSet.add(nums[j]);
//                 if (currSet.size() == distinctCounter) {
//                     distinctSubarrayCount++;
//                 }
//             }
//         }
//         return distinctSubarrayCount;
//     }
// }


public class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : nums) {
            uniqueElements.add(num);
        }
        int totalDistinct = uniqueElements.size();

        Map<Integer, Integer> windowCounts = new HashMap<>();
        int left = 0, completeSubarrayCount = 0;

        for (int right = 0; right < nums.length; right++) {
            windowCounts.put(nums[right], windowCounts.getOrDefault(nums[right], 0) + 1);

            while (windowCounts.size() == totalDistinct) {
                completeSubarrayCount += nums.length - right;
                windowCounts.put(nums[left], windowCounts.get(nums[left]) - 1);
                if (windowCounts.get(nums[left]) == 0) {
                    windowCounts.remove(nums[left]);
                }
                left++;
            }
        }

        return completeSubarrayCount;
    }
}
