public class Solution4 {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);

                StringBuilder stringBuilder = new StringBuilder(substr);

                if (substr.equals(stringBuilder.reverse().toString())) {
                    if (substr.length() > longestPalindrome.length()) {
                        longestPalindrome = substr;
                    }
                }
            }
        }
        return longestPalindrome;
    }
