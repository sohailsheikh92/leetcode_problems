class Solution {
    public String[] shortestSubstrings(String[] arr) {
        int n = arr.length;
        String[] result = new String[n];
        
        // Process each string in arr
        for (int i = 0; i < n; i++) {
            String curr = arr[i];
            // Generate all substrings of other strings
            Set<String> otherSubstrings = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    String other = arr[j];
                    for (int start = 0; start < other.length(); start++) {
                        for (int end = start + 1; end <= other.length(); end++) {
                            otherSubstrings.add(other.substring(start, end));
                        }
                    }
                }
            }
            
            // Find shortest uncommon substring for arr[i]
            String shortest = "";
            for (int len = 1; len <= curr.length() && shortest.equals(""); len++) {
                for (int start = 0; start + len <= curr.length(); start++) {
                    String sub = curr.substring(start, start + len);
                    if (!otherSubstrings.contains(sub)) {
                        if (shortest.equals("") || sub.compareTo(shortest) < 0) {
                            shortest = sub;
                        }
                    }
                }
            }
            result[i] = shortest;
        }
        
        return result;
    }
}