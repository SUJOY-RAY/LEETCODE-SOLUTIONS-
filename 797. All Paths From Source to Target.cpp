class Solution {
public:
    void dfs(int node, vector<int>&path,vector<vector<int>>& result, vector<vector<int>>& graph){
        path.push_back(node);
        if(node==graph.size()-1){
            result.push_back(path);
        }else{
            for(int neighbour:graph[node]){
                dfs(neighbour,path,result,graph);
            }
        }
        path.pop_back();
    }


    vector<vector<int>> allPathsSourceTarget(vector<vector<int>>& graph){
        vector<vector<int>>result;
        vector<int>path;
        dfs(0,path,result,graph);
        return result;
    }

};
