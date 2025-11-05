public class Solution {
    public int CountUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[,] grid = new int[m, n]; // 0 = empty, 1 = wall, 2 = guard, 3 = seen
        foreach (int[] w in walls) {
            grid[w[0], w[1]] = 1;
        }
        foreach (int[] g in guards) {
            grid[g[0], g[1]] = 2;
        }
        int[][] dirs = new int[][] {
            new int[] {-1, 0},
            new int[] { 1, 0},
            new int[] { 0,-1},
            new int[] { 0, 1}
        };

        foreach(int[] g  in guards){
            foreach(int[] d in dirs){
                int x = g[0] + d[0];
                int y = g[1] + d[1];

                while(x >= 0 && x < m && y >= 0 && y < n && grid[x, y] != 1 && grid[x, y] != 2){
                    if (grid[x, y] == 0) {
                        grid[x, y] = 3; 
                    }
                    x += d[0];
                    y += d[1];
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i, j] == 0) count++;
            }
        }

        return count;
    }
}
