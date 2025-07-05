class Solution {
    public int findLucky(int[] arr) {
        // Map<Integer, Integer> counter = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     counter.put(arr[i], counter.getOrDefault(arr[i], 0)+1);
        // }
        // int maxLucky = -1;
        // for(Map.Entry<Integer, Integer> a: counter.entrySet()){
        //     if(a.getKey()==a.getValue()){
        //         maxLucky = Math.max(maxLucky, a.getKey());
        //     }
        // }
        // return maxLucky;
        int n = Arrays.stream(arr).max().getAsInt();

        int[] counter = new int[n+1];

        for(int a: arr){
            counter[a]++;
        }
        
        int maxLucky = -1;        

        for(int i=1;i<=n;i++){
            if(counter[i]==i){
                maxLucky = Math.max(maxLucky, i);
            }
        }
        return maxLucky;
    }
}
