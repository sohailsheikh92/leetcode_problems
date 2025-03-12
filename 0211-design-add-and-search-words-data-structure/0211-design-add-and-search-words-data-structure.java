class WordDictionary {
    private WordDictionary[] children;
    private boolean isEnd;

    public WordDictionary() {
        children = new WordDictionary[26];
        isEnd = false;
    }

    public void addWord(String word) {
        WordDictionary node = this;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new WordDictionary();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        return match(word, 0, this);
    }

    private boolean match(String word, int index, WordDictionary node) {
        if (node == null) return false;
        if (index == word.length()) return node.isEnd;
        
        char c = word.charAt(index);
        if (c == '.') {
            for (WordDictionary child : node.children) {
                if (child != null && match(word, index + 1, child)) {
                    return true;
                }
            }
            return false;
        } else {
            int i = c - 'a';
            return match(word, index + 1, node.children[i]);
        }
    }
}
