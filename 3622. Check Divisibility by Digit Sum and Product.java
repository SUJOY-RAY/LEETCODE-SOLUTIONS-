class Solution {
    public boolean checkDivisibility(int n) {
        return n % (sum(n) + prod(n)) == 0;
    }

    private int sum(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sum(n / 10);
    }
    
    private int prod(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * prod(n / 10);
    }
}
