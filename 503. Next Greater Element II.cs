public class Solution {
    public int[] NextGreaterElements(int[] nums) {
        // int n = nums.Length;
        // int[] result = new int[n];

        // Array.Fill(result, -1);

        // Stack<int> stack = new Stack<int>();

        // for(int i = 0 ; i < 2 * n ; i++) {
        //     while(stack.Count > 0 && nums[stack.Peek()] < nums[i%n]){
        //         int index = stack.Pop();
        //         result[index] = nums[i % n];
        //     }

        //     if(i < n) {
        //         stack.Push(i);
        //     }
        // }

        // return result;

        int n = nums.Length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int nextGreater = -1;

            for (int j = 1; j < n; j++) {
                int nextIndex = (i + j) % n;
                if (nums[nextIndex] > nums[i]) {
                    nextGreater = nums[nextIndex];
                    break;
                }
            }

            result[i] = nextGreater;
        }
        return result;
    }
}
