class Solution {
    public long countDistinct(long n) {
        String digits = Long.toString(n);
        int m = digits.length();

        long[] power9 = new long[m + 1];

        power9[0] = 1;

        for(int i = 1; i <= m; i++) {
            power9[i] = power9[i - 1] * 9;
        }

        long total = 0;

        for(int length = 1; length < m; length++) {
            total += power9[length];
        }

        for(int idx = 0; idx < m; idx++) {
            int d = digits.charAt(idx) - '0';
            if(d == 0) {
                return total;
            }
            total += (long)(d - 1) * power9[m - idx - 1];
        }
        return total + 1;
    }
}
