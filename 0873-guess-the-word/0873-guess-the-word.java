/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
import java.util.*;

class Solution {
    public void findSecretWord(String[] words, Master master) {
        Random rand = new Random();

        for (int attempts = 0; attempts < 10; attempts++) {
            String guess = words[rand.nextInt(words.length)];
            int matches = master.guess(guess);
            if (matches == 6) return;

            List<String> filteredWords = new ArrayList<>();
            for (String word : words) {
                if (matchCount(word, guess) == matches) {
                    filteredWords.add(word);
                }
            }
            words = filteredWords.toArray(new String[0]);
        }
    }

    private int matchCount(String a, String b) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (a.charAt(i) == b.charAt(i)) count++;
        }
        return count;
    }
}
