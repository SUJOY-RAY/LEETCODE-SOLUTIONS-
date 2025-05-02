class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[]arr = dominoes.toCharArray();
        int[]forces = new int[n];

        int force = 0;
        for(int i=0;i<n;i++){
            if(arr[i]=='R'){ // When we see 'R', set force to n
                force = n;
            }else if(arr[i]=='L'){ // When we see 'L', set force to 0
                force = 0;
            }else{
                force = Math.max(force-1, 0);// When there is no force, we keep reducing the force by 1, and no force is there if the force hits 0.
            }
            forces[i]+=force;
        }
        force = 0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]=='L'){
                force = n;
            }else if(arr[i]=='R'){
                force = 0;
            }else{
                force = Math.max(force-1,0);
            }
            forces[i]-=force;
        }

        StringBuilder sb = new StringBuilder();
        for(int f: forces){
            if(f<0){
                sb.append('L');
            }else if(f>0){
                sb.append('R');
            }else{
                sb.append('.');
            }
        }
        return sb.toString();
    }
}
