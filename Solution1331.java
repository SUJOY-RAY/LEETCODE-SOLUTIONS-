import java.util.*;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] copy=Arrays.copyOf(arr, arr.length);
                Arrays.sort(arr);
        
        Map<Integer,Integer>rankMap=new HashMap<>();
        int rank=1;
        for (int num:arr){
            if (!rankMap.containsKey(num)) {
            rankMap.put(num, rank++);
            }
        }
        for(int i=0;i<copy.length;i++) {
            copy[i]=rankMap.get(copy[i]);
        }
        
        return copy;
    }
}
