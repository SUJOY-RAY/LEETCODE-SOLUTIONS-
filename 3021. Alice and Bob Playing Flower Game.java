class Solution {
    public long flowerGame(int n, int m) {
        long totalOddTillN = (n + 1) / 2;
        long totalEvenTillN = n / 2;
        long totalOddTillM = (m + 1) / 2;
        long totalEvenTillM = m / 2;

        return totalOddTillN * totalEvenTillM + totalEvenTillN * totalOddTillM;
    }
}
