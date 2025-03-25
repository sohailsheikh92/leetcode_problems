import java.util.*;

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<Character, List<StringBuilder>> waiting = new HashMap<>();

        // Initialize lists for each character
        for (char c = 'a'; c <= 'z'; c++) {
            waiting.put(c, new LinkedList<>());
        }

        // Populate waiting list with word characters
        for (String word : words) {
            waiting.get(word.charAt(0)).add(new StringBuilder(word));
        }

        int count = 0;
        for (char c : s.toCharArray()) {
            List<StringBuilder> oldBucket = waiting.get(c);
            waiting.put(c, new LinkedList<>()); // Clear the bucket

            for (StringBuilder sb : oldBucket) {
                sb.deleteCharAt(0); // Remove first character
                if (sb.length() == 0) {
                    count++; // Word is fully matched
                } else {
                    waiting.get(sb.charAt(0)).add(sb); // Move to next character
                }
            }
        }

        return count;
    }
}
