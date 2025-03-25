import java.util.*;

class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();
        for (String query : queries) {
            result.add(isMatch(query, pattern));
        }
        return result;
    }

    private boolean isMatch(String query, String pattern) {
        int i = 0; // Pointer for pattern
        for (char c : query.toCharArray()) {
            if (i < pattern.length() && c == pattern.charAt(i)) {
                i++; // Move pattern pointer if match found
            } else if (Character.isUpperCase(c)) {
                return false; // Extra uppercase letter is not allowed
            }
        }
        return i == pattern.length(); // Check if entire pattern matched
    }
}
