import java.util.*;

class WordFilter {
    private TrieNode root;

    public WordFilter(String[] words) {
        root = new TrieNode();
        for (int weight = 0; weight < words.length; weight++) {
            String word = words[weight] + "{"; // '{' is after 'z' in ASCII
            for (int i = 0; i < word.length(); i++) {
                TrieNode node = root;
                node.weight = weight;
                for (int j = i; j < 2 * word.length() - 1; j++) {
                    char c = word.charAt(j % word.length());
                    if (node.children[c - 'a'] == null) {
                        node.children[c - 'a'] = new TrieNode();
                    }
                    node = node.children[c - 'a'];
                    node.weight = weight;
                }
            }
        }
    }

    public int f(String prefix, String suffix) {
        TrieNode node = root;
        for (char c : (suffix + "{" + prefix).toCharArray()) {
            if (node.children[c - 'a'] == null) {
                return -1;
            }
            node = node.children[c - 'a'];
        }
        return node.weight;
    }

    private static class TrieNode {
        TrieNode[] children = new TrieNode[27]; // 'a' to 'z' + '{'
        int weight;
    }
}
