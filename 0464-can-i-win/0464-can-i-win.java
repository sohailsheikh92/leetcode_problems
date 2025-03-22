import java.util.*;

class Solution {
    Map<Integer, Boolean> memo = new HashMap<>();

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        int sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (sum < desiredTotal) return false;

        return canWin(0, maxChoosableInteger, desiredTotal);
    }

    private boolean canWin(int used, int max, int target) {
        if (memo.containsKey(used)) return memo.get(used);

        for (int i = 0; i < max; i++) {
            int bit = 1 << i;
            if ((used & bit) == 0) {
                if (i + 1 >= target || !canWin(used | bit, max, target - (i + 1))) {
                    memo.put(used, true);
                    return true;
                }
            }
        }
        memo.put(used, false);
        return false;
    }
}
