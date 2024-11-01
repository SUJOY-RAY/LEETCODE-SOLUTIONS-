class Solution {
public:
    int fib(int n) {
        if(n<=1){
            return n;
        }
        int first=0,second=1;
        for(int i=2;i<=n;i++){
            int temp=second;
            second=first+second;
            first=temp;
        }
        return second;

    }
};


// class Solution {
// public:
//     int fib(int n) {
//         if (n<=1){
//             return;
//         }
//         int first=fib(n-1);
//         int second=fib(n-2);
//         return first+second;
//     }
// };
