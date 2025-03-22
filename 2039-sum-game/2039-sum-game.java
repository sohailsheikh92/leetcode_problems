class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0, rightSum = 0, leftQ = 0, rightQ = 0;

        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                if (num.charAt(i) == '?') leftQ++;
                else leftSum += num.charAt(i) - '0';
            } else {
                if (num.charAt(i) == '?') rightQ++;
                else rightSum += num.charAt(i) - '0';
            }
        }

        int diff = leftSum - rightSum;
        int qDiff = leftQ - rightQ;

        // If the difference between '?' counts makes it impossible to balance
        return (diff * 2 != -qDiff * 9);
    }
}
