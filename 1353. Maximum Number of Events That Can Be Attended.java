class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a->a[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int maxDay = 1, attended = 0, i = 0, n = events.length;
        for(int[] event:events){
            maxDay = Math.max(maxDay, event[1]);
        }
        
        for(int day = 1 ; day <= maxDay ; day++){
            while(i < n && events[i][0] == day){
                pq.offer(events[i][1]);
                i++;
            }

            while(!pq.isEmpty() && pq.peek()<day){
                pq.poll();
            }
            if(!pq.isEmpty()){
                pq.poll();
                attended++;
            }
        }
        return attended;
    }
}
