class Solution {
    public long countGood(int[] nums, int k) {
        int left = 0;
        long result = 0;
        Map<Integer, Integer> count = new HashMap<>();
        long pairs = 0;

        for(int right = 0; right < nums.length; right++){
            int num = nums[right];
            int currentCount = count.getOrDefault(num, 0);

            pairs += currentCount;
            count.put(num, currentCount + 1);
            while(pairs >= k){
                result += nums.length - right;

                int leftNum = nums[left];
                count.put(leftNum, count.get(leftNum) - 1);
                pairs -= count.get(leftNum);
                left++;
            }
        }
    return result;
    }
}
