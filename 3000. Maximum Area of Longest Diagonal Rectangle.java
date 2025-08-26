class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        // Convert array to list for sorting
        List<int[]> list = Arrays.asList(dimensions);

        // Sort based on diagonal length first, and area as a tiebreaker
        list.sort((a, b) -> {
            double diagA = Math.sqrt(a[0] * a[0] + a[1] * a[1]);
            double diagB = Math.sqrt(b[0] * b[0] + b[1] * b[1]);

            if (diagA == diagB) { // if diagonals are same, compare by area
                int areaA = a[0] * a[1];
                int areaB = b[0] * b[1];
                return Integer.compare(areaB, areaA); // larger area first
            }
            return Double.compare(diagB, diagA); // larger diagonal first
        });

        // First element will now have the largest diagonal (and area if tied)
        int[] best = list.get(0);
        return best[0] * best[1];
    }
}
