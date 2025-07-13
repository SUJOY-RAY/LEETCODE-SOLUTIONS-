class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int m = players.length, n = trainers.length;

        Arrays.sort(players);
        Arrays.sort(trainers);
        
        int i = 0 ,j = 0;
        int counter = 0;

        while(i < m && j < n){
            if(players[i] <= trainers[j]){
                counter++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return counter;
    }
}
