class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        int n = arr.size();
        if (n < 3)
            return false;
        unordered_map<string, int> stateChanges;
        bool isUp = false;
        bool isDown = false;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                if (isDown)
                    return false;
                isUp = true;
            } else if (arr[i] < arr[i - 1]) {
                if (!isUp)
                    return false;
                isDown = true;
            } else {
                return false;
            }
        }

        return isUp && isDown;
    }
};
