class Solution {
public:
    char next;
    char nextGreatestLetter(vector<char>& letters, char target) {
        int left=0,right=letters.size()-1;
        int resultIndex=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(letters[mid]>target){
                resultIndex=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        if(left>=letters.size()){
            return letters[0];
        }
    return letters[resultIndex];
    }
};
