import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // If the current string length equals 2 * n, add it to the result
        if (current.length() == 2 * max) {
            result.add(current);
            return;
        }
        
        // Add an opening parenthesis if we have some left to use
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        
        // Add a closing parenthesis if we have more open than closed
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}