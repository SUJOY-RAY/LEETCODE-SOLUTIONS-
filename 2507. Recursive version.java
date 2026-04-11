class Solution {
    public int smallestValue(int n) {
        int sum = getFactors(n).stream().mapToInt(Integer::intValue).sum();
        if (sum == n) {
            return n;
        }
        return smallestValue(sum);
    }

    private List<Integer> getFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0 && n > 0) {
                factors.add(i);
                n = n / i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
