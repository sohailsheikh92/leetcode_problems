import java.util.*;

class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));

        // Remove words that are suffixes of other words
        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                wordSet.remove(word.substring(i));
            }
        }

        // Compute the total encoded length
        int length = 0;
        for (String word : wordSet) {
            length += word.length() + 1; // +1 for the '#' symbol
        }

        return length;
    }
}
