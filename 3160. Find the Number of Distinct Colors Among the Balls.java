
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer,Integer> ballColors = new HashMap<>(); 
        Map<Integer,Integer> colorFreq = new HashMap<>();  
        List<Integer> result = new ArrayList<>(); 

        for(int i=0; i<queries.length; i++){
            int ball = queries[i][0], color = queries[i][1];

            if(ballColors.containsKey(ball)){
                int oldColor = ballColors.get(ball);
                colorFreq.put(oldColor, colorFreq.get(oldColor)-1);

                if(colorFreq.get(oldColor) == 0){
                    colorFreq.remove(oldColor);
                }
            }

            ballColors.put(ball,color);
            colorFreq.put(color,colorFreq.getOrDefault(color,0) + 1);

            result.add(colorFreq.size());
        }
        int output[] = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            output[i] = result.get(i);  
        }
        return output;
    }
}
