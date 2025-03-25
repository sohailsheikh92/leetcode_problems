import java.util.*;

class Solution {
    public String longestWord(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        String longest = "";

        for (String word : words) {
            if (isBuildable(word, wordSet)) {
                if (word.length() > longest.length() || 
                    (word.length() == longest.length() && word.compareTo(longest) < 0)) {
                    longest = word;
                }
            }
        }
        return longest;
    }

    private boolean isBuildable(String word, Set<String> wordSet) {
        for (int i = 1; i < word.length(); i++) {
            if (!wordSet.contains(word.substring(0, i))) {
                return false;
            }
        }
        return true;
    }
}
