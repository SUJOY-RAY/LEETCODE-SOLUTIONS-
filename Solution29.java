class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }

        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);

        long quotient = 0;
        while (dividendL >= divisorL) {
            long temp = divisorL;
            long multiple = 1;

            while (dividendL >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dividendL -= temp;
            quotient += multiple;
        }

        int result = (int) (quotient * (dividend < 0 ^ divisor < 0 ? -1 : 1));
        return result;
    }
}
