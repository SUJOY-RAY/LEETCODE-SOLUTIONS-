class Solution {
    public int possibleStringCount(String word) {
        int count = 0;
        char prev = word.charAt(0);
        int n = word.length();
        for(int i=1; i<n; i++) {
            char c = word.charAt(i);
            if(c==prev){
                count++;
            } else{
                prev = c;
            }
        }    
        return count+1;
    }
}


// class Solution {
//     public int possibleStringCount(String word) {
//         int n = word.length();
//         int count = n;
//         for(int i=1;i<n;i++){
//             if(word.charAt(i)!=word.charAt(i-1)){
//                 count--;
//             }
//         }
//         return count;
//     }
// }
