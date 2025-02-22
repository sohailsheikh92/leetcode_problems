class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";  // If empty, return ""

        int start = 0, maxLen = 0;  // Start index & max length of longest palindrome

        for (int i = 0; i < s.length(); i++) {  
            // Expand around a single character (odd-length palindrome)
            int len1 = expandAroundCenter(s, i, i);
            // Expand between two characters (even-length palindrome)
            int len2 = expandAroundCenter(s, i, i + 1);
            
            int len = Math.max(len1, len2);  // Take the longest found
            
            if (len > maxLen) {  // If it's the longest so far, update start & maxLen
                maxLen = len;
                start = i - (len - 1) / 2;  // Calculate the starting index of the palindrome
            }
        }

        return s.substring(start, start + maxLen);  // Extract the longest palindrome
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;  // Move left pointer left
            right++; // Move right pointer right
        }
        return right - left - 1;  // Length of the palindrome
    }
}
