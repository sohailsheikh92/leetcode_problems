import java.util.*;

class Solution {
    Map<String, List<String>> memo = new HashMap<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return dfs(s, wordSet);
    }

    private List<String> dfs(String s, Set<String> wordSet) {
        if (memo.containsKey(s)) return memo.get(s);
        List<String> result = new ArrayList<>();
        
        if (wordSet.contains(s)) result.add(s);

        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            if (wordSet.contains(left)) {
                List<String> rightPart = dfs(s.substring(i), wordSet);
                for (String r : rightPart) {
                    result.add(left + " " + r);
                }
            }
        }
        memo.put(s, result);
        return result;
    }
}
