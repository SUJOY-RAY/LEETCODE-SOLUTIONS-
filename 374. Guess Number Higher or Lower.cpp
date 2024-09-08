/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
public:
    int guessNumber(int n) {
        long long left=1, right=n;
        while(left<=right){
            long long mid=(left+right)/2;

            if(guess(mid)==-1){
                right=mid-1;
            }else if(guess(mid)==1){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return n;
    }
};

// class Solution {
// public:
//     int guessNumber(int n) {
//         long long left=1, right=n;
//         while(guess(n)!=0){
//             n=(left+right)/2;
//             if(guess(n)==-1){
//                 right=n;
//             }else if(guess(n)==1){
//                 left=n;
//             }
//         }
//         return n;
//     }
// };
