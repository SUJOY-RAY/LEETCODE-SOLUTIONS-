public class Solution {
    public int[] GetNoZeroIntegers(int n) {
        bool NonZero(int x){
            return !x.ToString().Contains('0');
        }
        for(int i = 1 ; i < n ; i++){
            int j = n - i;
            if(NonZero(i) && NonZero(j)){
                return new int[] {i, j};
            }
        }
        return new int[0];
    }
}
