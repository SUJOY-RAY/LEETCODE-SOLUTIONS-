class Solution {
public:
    vector<string> fullJustify(vector<string>& words, int maxWidth) {
        
        vector<string> result;
        vector<string> currLine;
        int currLen=0;

        for(string& word: words){
            if(currLen+word.size()+currLine.size()>maxWidth){
                
                int totalSpaces=maxWidth-currLen;
                
                if(currLine.size()==1){
                    result.push_back(currLine[0]+string(totalSpaces,' '));
                }else{
                    int numSpaces=currLine.size()-1;
                    int evenSpace=totalSpaces/numSpaces;
                    int extraSpace=totalSpaces%numSpaces;

                    string line="";
                    for(int i=0;i<numSpaces;++i){
                        line+=currLine[i];
                        line+=string(evenSpace + (i<extraSpace? 1 : 0),' ');
                    }
                    line+=currLine.back();
                    result.push_back(line);
                }
                currLine.clear();
                currLen=0;
            }
            currLine.push_back(word);
            currLen += word.size();
        }
        string lastLine= "";
        for(int i=0;i<currLine.size();++i){
            if(i>0) lastLine+=' ';
            lastLine+=currLine[i];
        }
        lastLine+=string(maxWidth-lastLine.size(),' ');
        result.push_back(lastLine);

        return result;


    }
};
