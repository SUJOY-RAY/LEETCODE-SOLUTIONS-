class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> result = new LinkedList<>();
        Arrays.sort(folder);
        int n = folder.length;
        
        String prev = "";

        for (String f : folder) {
            if(prev.isEmpty()||!f.startsWith(prev + "/")){
                result.add(f);
                prev = f;
            }
        }
        return result;
    }
}
