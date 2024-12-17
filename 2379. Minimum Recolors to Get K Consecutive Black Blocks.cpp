class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int back = 0, front = 0, countW = 0, ans = INT_MAX;
        while (front < blocks.size()) {
            if (blocks[front] == 'W')
                {countW++;}

            if (front - back + 1 == k) {
                ans = min(ans, countW);
                if (blocks[back] == 'W')
                    countW--;
                back++;
            }
            front++;
        }
        return ans;
    }
};
