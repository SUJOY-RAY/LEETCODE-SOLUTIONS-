class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // for (char c : letters) {
        //     if (c > target) {
        //         return c;
        //     }
        // }
        // return letters[0];

        // int left = 0, right = letters.length - 1;

        // while(left <= right) {
        //     int mid = left + (right - left) / 2;
        //     if(letters[mid] <= target) {
        //         left = mid + 1;
        //     } else{
        //         right = mid - 1;
        //     }
        // }
        // return letters[left % letters.length];

        for (int i = 0; i < letters.length; i++) {
            if (target < letters[i]) {
                return letters[i];
            }
        }
        return letters[0];
    }
}
