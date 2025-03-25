class Solution {
    public int minDistance(String word1, String word2) {
        final int lcst = usingSpaceOptimization(word1, word2);
        return word1.length() - lcst + word2.length() - lcst;
    }

    private int usingSpaceOptimization(final String s1, final String s2) {
        final int s1l = s1.length();
        final int s2l = s2.length();
        int[] prev = new int[s2l + 1];
        for (int i = 1; i <= s1l; i++) {
            final int[] curr = new int[s2l + 1];
            for (int j = 1; j <= s2l; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    curr[j] = 1 + prev[j - 1];
                } else {
                    curr[j] = Math.max(prev[j], curr[j - 1]);
                }
            }
            prev = curr;
        }
        return prev[s2l];
    }
}