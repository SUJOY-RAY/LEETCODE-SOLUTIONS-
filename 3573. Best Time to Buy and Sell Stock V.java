class Solution {
    public long maximumProfit(int[] prices, int k) {
        long NEG = Long.MIN_VALUE / 4;

        long[] flat = new long[k + 1];
        long[] longPos = new long[k + 1];
        long[] shortPos = new long[k + 1];

        // Initialize
        for (int i = 0; i <= k; i++) {
            flat[i] = NEG;
            longPos[i] = NEG;
            shortPos[i] = NEG;
        }

        flat[0] = 0;

        for (int price : prices) {

            long[] nFlat = flat.clone();
            long[] nLong = longPos.clone();
            long[] nShort = shortPos.clone();

            for (int t = 0; t <= k; t++) {

                // Open a normal transaction (buy)
                nLong[t] = Math.max(nLong[t], flat[t] - price);

                // Open a short transaction (sell first)
                nShort[t] = Math.max(nShort[t], flat[t] + price);

                if (t < k) {

                    // Close normal transaction (sell)
                    nFlat[t + 1] = Math.max(
                        nFlat[t + 1],
                        longPos[t] + price
                    );

                    // Close short transaction (buy back)
                    nFlat[t + 1] = Math.max(
                        nFlat[t + 1],
                        shortPos[t] - price
                    );
                }
            }

            flat = nFlat;
            longPos = nLong;
            shortPos = nShort;
        }

        long ans = 0;

        for (int t = 0; t <= k; t++) {
            ans = Math.max(ans, flat[t]);
        }

        return ans;
    }
}
