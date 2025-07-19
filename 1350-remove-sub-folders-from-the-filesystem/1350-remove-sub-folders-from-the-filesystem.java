import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder); // Sort lexicographically
        List<String> result = new ArrayList<>();
        
        String prev = "";
        for (String dir : folder) {
            if (prev.isEmpty() || !dir.startsWith(prev + "/")) {
                result.add(dir);
                prev = dir;
            }
        }
        
        return result;
    }
}