class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        
        for (char ch : brokenLetters.toCharArray()) {
            set.add(ch);
        }

        String[] words = text.split(" ");  // split into words
        for (String word : words) {
            boolean canType = true;
            for (char ch : word.toCharArray()) {
                if (set.contains(ch)) {
                    canType = false;
                    break;
                }
            }
            if (canType) ans++;
        }
        
        return ans;
    }
}
