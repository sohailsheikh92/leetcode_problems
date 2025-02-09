class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+"); // Split by one or more spaces

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]); 
            if (i > 0) sb.append(" "); // Add space except for the last word
        }
        return sb.toString();
    }
}
