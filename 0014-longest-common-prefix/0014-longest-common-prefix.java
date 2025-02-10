class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Trie trie = new Trie();
        for (String word : strs) {
            trie.insert(word);
        }

        return trie.longestCommonPrefix();
    }
}

class TrieNode {
    TrieNode[] children = new TrieNode[26]; // 26 lowercase English letters
    boolean isEnd; // Marks the end of a word
}

class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a'; // Convert character to index
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEnd = true; // Mark end of the word
    }

    String longestCommonPrefix() {
        TrieNode node = root;
        StringBuilder prefix = new StringBuilder();

        while (true) {
            int count = 0;
            int nextIndex = -1;

            // Count children
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null) {
                    count++;
                    nextIndex = i;
                }
            }

            // Stop if more than one branch or end of a word is reached
            if (count != 1 || node.isEnd) break;

            // Move to next node
            node = node.children[nextIndex];
            prefix.append((char) (nextIndex + 'a')); // Convert index back to character
        }

        return prefix.toString();
    }
}
