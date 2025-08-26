class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int idx = 0;

        // store diagonal² of first rectangle
        int maxDiagonalSq = dimensions[0][0] * dimensions[0][0] + dimensions[0][1] * dimensions[0][1];

        for (int i = 1; i < n; i++) {
            int currDiagonalSq = dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1];

            // if current diagonal is greater, update
            if (currDiagonalSq > maxDiagonalSq) {
                maxDiagonalSq = currDiagonalSq;
                idx = i;
            }
            // if equal diagonals, choose max area
            else if (currDiagonalSq == maxDiagonalSq) {
                int currArea = dimensions[i][0] * dimensions[i][1];
                int prevArea = dimensions[idx][0] * dimensions[idx][1];
                if (currArea > prevArea) {
                    idx = i;
                }
            }
        }

        // return area of chosen rectangle
        return dimensions[idx][0] * dimensions[idx][1];
    }
}
