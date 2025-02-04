import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        
        // Adding elements of nums1 to the set
        for (int i : nums1) {
            set.add(i);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // Checking if elements of nums2 are in the set
        for (int j : nums2) {
            if (set.contains(j)) {
                result.add(j);
                set.remove(j);  // Now, we don't need this line to prevent duplicates.
            }
        }
        
        // Converting the result list to an array
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        
        return arr;
    }
}
