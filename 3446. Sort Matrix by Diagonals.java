class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> diagonals = new HashMap<>();

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int key = r - c;
                diagonals.putIfAbsent(key, new ArrayList<>());
                diagonals.get(key).add(grid[r][c]);
            }
        }

                for (int key : diagonals.keySet()) {
            List<Integer> diag = diagonals.get(key);
            if (key >= 0) { 
                diag.sort(Collections.reverseOrder());
            } else { 
                Collections.sort(diag); 
            }
        }
                for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int key = r - c;
                grid[r][c] = diagonals.get(key).remove(0);
            }
        }

        return grid;
    }
}
