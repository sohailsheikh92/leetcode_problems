import java.util.*;

class MagicDictionary {
    private Set<String> words;

    public MagicDictionary() {
        words = new HashSet<>();
    }

    public void buildDict(String[] dictionary) {
        words.addAll(Arrays.asList(dictionary));
    }

    public boolean search(String searchWord) {
        for (String word : words) {
            if (word.length() == searchWord.length() && isOneEditAway(word, searchWord)) {
                return true;
            }
        }
        return false;
    }

    private boolean isOneEditAway(String word1, String word2) {
        int count = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                count++;
                if (count > 1) return false;
            }
        }
        return count == 1;
    }
}
