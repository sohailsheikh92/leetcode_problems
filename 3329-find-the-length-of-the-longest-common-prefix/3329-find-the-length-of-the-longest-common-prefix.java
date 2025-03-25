class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        // Build a set of all prefixes from arr1
        Set<String> prefixes = new HashSet<>();
        for (int num : arr1) {
            String str = String.valueOf(num);
            for (int i = 1; i <= str.length(); i++) {
                prefixes.add(str.substring(0, i));
            }
        }
        
        // Check prefixes of arr2 against the set
        int maxLength = 0;
        for (int num : arr2) {
            String str = String.valueOf(num);
            for (int i = 1; i <= str.length(); i++) {
                String prefix = str.substring(0, i);
                if (prefixes.contains(prefix)) {
                    maxLength = Math.max(maxLength, i);
                }
            }
        }
        
        return maxLength;
    }
}