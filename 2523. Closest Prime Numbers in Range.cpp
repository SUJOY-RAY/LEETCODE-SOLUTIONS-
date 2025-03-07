class Solution {
public:
    vector<int> closestPrimes(int left, int right) {
        // Using the sieve of eratosthenes method to find the primes beten left
        // and right

        vector<bool> sieve(right + 1, true);
        sieve[0] = sieve[1] = false;

        for (int i = 2; i * i <= right; ++i) {
            if (sieve[i]) {
                for (int j = i * i; j <= right; j += i) {
                    sieve[j] = false;
                }
            }
        }
        vector<int> primes;
        for (int i = max(2, left); i <= right; ++i) {
            if (sieve[i]) {
                primes.push_back(i);
            }
        }
        if (primes.size() < 2) return {-1, -1};

        int mingap = INT_MAX;
        vector<int> result = {-1, -1};
        for (int i = 1; i < primes.size(); ++i) {
            if (mingap > (primes[i] - primes[i - 1])) {
                mingap = primes[i] - primes[i - 1];
                result = {primes[i - 1], primes[i]};
            }
        }
        return result;
    }
};
