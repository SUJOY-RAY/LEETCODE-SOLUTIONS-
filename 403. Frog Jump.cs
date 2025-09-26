public class Solution {
    public bool CanCross(int[] stones) {
        int n = stones.Length;

        if (stones[1] != 1) return false;

        Dictionary<int, HashSet<int>> jumps = new Dictionary<int, HashSet<int>>();
    
        foreach (int stone in stones) {
            jumps[stone] = new HashSet<int>();
        }

        jumps[0].Add(0);

        foreach(int stone in stones) {
            foreach(int jump in jumps[stone]){
                for(int i = -1; i <= 1; i++) {
                    int nextJump = jump + i;
                    if(nextJump > 0){
                        int nextStone = stone + nextJump;
                        if (jumps.ContainsKey(nextStone)) {
                            jumps[nextStone].Add(nextJump);
                        }
                    }
                }
            }
        }
        return jumps[stones[n - 1]].Count > 0;
    }
}
