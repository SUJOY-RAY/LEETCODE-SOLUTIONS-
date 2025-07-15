class Solution {
    public boolean isValid(String word) {
        word = word.toLowerCase();
        
        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        String letters = "abcdefghijklmnopqrstuvwxyz1234567890";

        int vc = 0, cc = 0;
        int[] arr = new int[21];

        if (word.length() >= 3) {
            for (char a : word.toCharArray()) {
                if (letters.indexOf(a) == -1) {
                    return false;
                }
                if (vowels.indexOf(a) != -1) {
                    vc++;
                }
                if (consonants.indexOf(a) != -1) {
                    cc++;
                }
            }
        }
        return vc > 0 && cc > 0;
    }
}
