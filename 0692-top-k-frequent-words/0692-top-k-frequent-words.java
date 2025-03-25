import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freqMap = new HashMap<>();
        
        // Count frequency of each word
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Sort words by frequency and lexicographical order
        List<String> wordList = new ArrayList<>(freqMap.keySet());
        wordList.sort((a, b) -> freqMap.get(a).equals(freqMap.get(b)) ? a.compareTo(b) : freqMap.get(b) - freqMap.get(a));

        // Return top k words
        return wordList.subList(0, k);
    }
}
