class Solution {
    public String triangleType(int[] nums) {
        // Arrays.sort(nums);
        // if (nums.length != 3 || nums[0] + nums[1] <= nums[2]) {
        //     return "none";
        // }

        // Map<Integer, Integer> counter = new HashMap<>();
        // for (int a : nums) {
        //     counter.put(a, counter.getOrDefault(a, 0) + 1);
        // }
        // if (counter.size() == 3) {
        //     return "scalene";
        // } else if (counter.size()==2) {
        //     return "isosceles";
        // } else {
        //     return "equilateral";
        // }

        int a = nums[0], b = nums[1], c = nums[2];
        if (a + b <= c || a + c <= b || b + c <= a)
            return "none";
        if (a == b && b == c)
            return "equilateral";
        if (a == b || b == c || a == c)
            return "isosceles";
        return "scalene";

    }
}
