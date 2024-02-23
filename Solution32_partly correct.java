class Solution {
    public int longestValidParentheses(String s) {
        char[] chararr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chararr[i] = s.charAt(i);
        }

        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (chararr[i] == '(' && chararr[i + 1] == ')') {
                count += 2;
                i++; 
            }
        }
        return count;
    }
}
