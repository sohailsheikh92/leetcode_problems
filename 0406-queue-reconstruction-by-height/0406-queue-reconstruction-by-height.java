import java.util.*;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // Sort by height descending, then by k ascending
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        
        // Use a list to dynamically insert elements
        List<int[]> result = new ArrayList<>();
        
        // Insert each person at index k
        for (int[] person : people) {
            result.add(person[1], person);
        }
        
        // Convert list back to array
        return result.toArray(new int[people.length][]);
    }
}