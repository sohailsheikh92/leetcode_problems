import java.util.*;

class Solution {
    public int[] processQueries(int[] queries, int m) {
        // Initialize permutation as [1, 2, ..., m]
        List<Integer> perm = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            perm.add(i);
        }
        
        // Array to store the result
        int[] ans = new int[queries.length];
        
        // Process each query
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            // Find the position of the query value
            int pos = perm.indexOf(query);
            ans[i] = pos;  // Store the position in the result
            
            // Move the queried value to the front
            perm.remove(pos);         // Remove from current position
            perm.add(0, query);       // Add to the front
        }
        
        return ans;
    }
}