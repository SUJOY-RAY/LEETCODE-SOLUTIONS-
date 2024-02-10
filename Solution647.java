class Solution {
    public int countSubstrings(String s) {
        int index = 0;
        int n = s.length();
        String[] arr = new String[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                arr[index++] = s.substring(i, j);
            }
        }

        int count = 0;
        int check = 0;

        while (check < index) {
            if (isPalindrome(arr[check])) {
                count++;
            }
            check++;
        }

        return count;
    }

    private boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder(s).reverse();
        return s.equals(reversed.toString());
    }
}
