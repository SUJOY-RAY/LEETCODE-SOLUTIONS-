public class Solution {
    public int RepeatedNTimes(int[] nums) {
        Dictionary<int, int> count = new Dictionary<int, int>();
        foreach(int n in nums) {
            if(count.ContainsKey(n)) {
                return n;
            }
            count[n] = 1;
        }
        return 0;
    }
}
