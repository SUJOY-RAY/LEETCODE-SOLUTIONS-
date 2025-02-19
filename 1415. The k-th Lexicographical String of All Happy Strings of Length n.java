class Solution {
    public String getHappyString(int n, int k) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.offer("a");
        pq.offer("b");
        pq.offer("c");
        int counter=0;
        while(!pq.isEmpty()){
            String current=pq.poll();
            if(current.length()==n){
                counter++;
                if(counter==k){
                    return current;
                }
                continue;
            }
            for(char c:new char[]{'a','b','c'}){
                if(current.charAt(current.length()-1)!=c){
                    pq.offer(current+c);
                }
            }
        }
        return ""; 
    }
}
