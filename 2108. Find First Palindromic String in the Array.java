class Solution {
    public static boolean checkPalindrome(String data){
        int n = data.length();
        for (int i = 0; i < n / 2; i++) {
            if (data.charAt(i) != data.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String a: words){
            if(checkPalindrome(a)){
                return a;
            }
        }
        return "";
    }
}
