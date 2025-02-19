import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li = new ArrayList<>();
        Map<Character, Integer> pMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        int n = p.length(), m = s.length();

        if (m < n) return li; // Edge case

        // Initialize frequency map for p and first window of s
        for (int i = 0; i < n; i++) {
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Check first window
        if (pMap.equals(sMap)) li.add(0);

        // Sliding window
        for (int i = n; i < m; i++) {
            char newChar = s.charAt(i);
            char oldChar = s.charAt(i - n);

            // Add new character
            sMap.put(newChar, sMap.getOrDefault(newChar, 0) + 1);
            // Remove old character
            if (sMap.get(oldChar) == 1) 
                sMap.remove(oldChar);
            else 
                sMap.put(oldChar, sMap.get(oldChar) - 1);

            if (pMap.equals(sMap)) 
                li.add(i - n + 1);
        }

        return li;
    }
}
