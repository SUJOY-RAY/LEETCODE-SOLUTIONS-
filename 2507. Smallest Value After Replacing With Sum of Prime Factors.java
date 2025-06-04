class Solution {
    public int smallestValue(int n) {
        int sum = n;
        while (true) {
            int sum1 = 0;
            int divisor = 2;

            while (n > 1) {
                if (n % divisor == 0) {
                    sum1 += divisor;
                    n = n / divisor;
                } else {
                    divisor++;
                }
            }

            n = sum1;
            if (sum == sum1)
                break;
            else
                sum = sum1;
        }
        return sum;
    }
}
