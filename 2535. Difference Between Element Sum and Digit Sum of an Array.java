class Solution {
    public static int intToArrSum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public int differenceOfSum(int[] nums) {
        // int digitSum=0;
        // int elementSum=0;
        // for(int a:nums){
        //     elementSum+=a;
        //     digitSum+=intToArrSum(a);
        // }
        // return Math.abs(elementSum-digitSum);

        int result=0;

        for(int a:nums){
            result+=a-((a/1000)%10+(a/100)%10+(a/10)%10+a%10);
        }
        return Math.abs(result);
    }
}
