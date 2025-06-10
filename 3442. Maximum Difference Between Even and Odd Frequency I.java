class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[26];
        for (char ch : s.toCharArray())
            arr[ch - 'a']++;
        int oddmax = 0, evenmax = s.length();

        for (int i : arr) {
            if (i % 2 == 1) {
                oddmax = Math.max(i, oddmax);
            } else {
                evenmax = Math.min(i == 0 ? s.length() : i, evenmax);
            }
        }
        return oddmax - evenmax;
    }
}


// class Solution {
//     public int maxDifference(String s) {
//         HashMap<Character, Integer> freqMap = new HashMap<>();

//         for (char c : s.toCharArray()) {
//             freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
//         }

//         int maxOdd = Integer.MIN_VALUE;
//         int minEven = Integer.MAX_VALUE;

//         for (int freq : freqMap.values()) {
//             if (freq % 2 == 1) {
//                 maxOdd = Math.max(maxOdd, freq);
//             } else {
//                 minEven = Math.min(minEven, freq);
//             }
//         }

//         if (maxOdd == Integer.MIN_VALUE || minEven == Integer.MAX_VALUE) {
//             return -1;
//         }

//         return maxOdd - minEven;
//     }
// }
