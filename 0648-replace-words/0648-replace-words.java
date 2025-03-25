import java.util.*;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode root = new TrieNode();
        
        // Build Trie from dictionary
        for (String word : dictionary) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c - 'a'];
            }
            node.isEnd = true;
        }
        
        // Replace words in sentence
        StringBuilder result = new StringBuilder();
        for (String word : sentence.split(" ")) {
            TrieNode node = root;
            StringBuilder prefix = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null || node.isEnd) break;
                prefix.append(c);
                node = node.children[c - 'a'];
            }
            result.append(node.isEnd ? prefix.toString() : word).append(" ");
        }
        
        return result.toString().trim();
    }
    
    // Trie Node class
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }
}
