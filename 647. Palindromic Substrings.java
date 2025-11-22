class Solution {

    private int checkPalindrome(String s, int l, int r) {
        int count = 0;
        // We run this for every character in the main string.
        while(l >= 0 && r <= s.length() && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
        }
        return count;
    }

    public int countSubstrings(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            ans += checkPalindrome(s, i, i);
            ans += checkPalindrome(s, i, i + 1);
        }
        return ans;
    }
}
