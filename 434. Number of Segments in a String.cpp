class Solution {
public:
    int countSegments(string s) {
        int counter = 0;
        bool inSegment = false;

        for (char c : s) {
            if (c != ' ' && !inSegment) {
                inSegment = true;
                counter++;
            } else if (c == ' ') {
                inSegment = false;
            }
        }
        return counter;
    }
};
