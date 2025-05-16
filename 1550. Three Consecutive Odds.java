class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int counter = 0;
        for (int num : arr) {
            if (num % 2 == 1) {

                counter++;
                if (counter == 3) {
                    return true;
                }
            } else {
                counter = 0;
            }
        }
        return false;
    }
}
