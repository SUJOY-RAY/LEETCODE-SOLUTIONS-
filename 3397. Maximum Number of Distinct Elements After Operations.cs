//// Causes TLE
// public class Solution {
//     public int MaxDistinctElements(int[] nums, int k) {
//         Array.Sort(nums);
//         HashSet<int> used = new HashSet<int>();

//         foreach (int num in nums) {
//             int placed = num - k;

//             while (placed <= num + k && used.Contains(placed)) {
//                 placed++;
//             }

//             if (placed <= num + k) {
//                 used.Add(placed);
//             }
//         }

//         return used.Count;
//     }
// }

public class Solution {
    public int MaxDistinctElements(int[] nums, int k) {
        Array.Sort(nums);
        long nextFree = long.MinValue;
        int distinct = 0;

        foreach (int num in nums) {
            long low = (long)num - k;
            long high = (long)num + k;

            long place = Math.Max(low, nextFree);

            if (place <= high) {
                distinct++;
                nextFree = place + 1;
            }
        }

        return distinct;
    }
}
