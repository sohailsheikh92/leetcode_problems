class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        if (n < 3) return 0;
        
        int teams = 0;
        
        // For each element as the middle of the team
        for (int j = 1; j < n - 1; j++) {
            // Count elements less than and greater than rating[j] on both sides
            int leftLess = 0, leftGreater = 0;
            int rightLess = 0, rightGreater = 0;
            
            // Count on the left side (i < j)
            for (int i = 0; i < j; i++) {
                if (rating[i] < rating[j]) {
                    leftLess++;
                } else if (rating[i] > rating[j]) {
                    leftGreater++;
                }
            }
            
            // Count on the right side (k > j)
            for (int k = j + 1; k < n; k++) {
                if (rating[k] < rating[j]) {
                    rightLess++;
                } else if (rating[k] > rating[j]) {
                    rightGreater++;
                }
            }
            
            // Increasing teams: leftLess * rightGreater
            // Decreasing teams: leftGreater * rightLess
            teams += leftLess * rightGreater + leftGreater * rightLess;
        }
        
        return teams;
    }
}