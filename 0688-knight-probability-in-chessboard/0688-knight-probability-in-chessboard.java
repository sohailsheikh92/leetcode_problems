class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        //Create memoization array
        double[][][] cellPossibilities = new double[n][n][k + 1];

        return calculatePossibilities(cellPossibilities, k, row, column);
    }

    public double calculatePossibilities (double[][][] cells, int k, int row, int column) {

        //Checks invalid moves (out of bounds)
        if (row < 0 || cells.length <= row ) return 0;
        if (column < 0 || cells.length <= column) return 0;

        //If valid but no more moves, returns 1
        if (k == 0) {
            cells[row][column][0] = 1;
            return 1;
        }

        //If valid but more moves, get the 8 other possible moves (clockwise)
        if (cells[row][column][k] == 0) {
            double nneMove = calculatePossibilities(cells, k - 1, row - 2, column + 1);
            double neeMove = calculatePossibilities(cells, k - 1, row - 1, column + 2);
            double seeMove = calculatePossibilities(cells, k - 1, row + 1, column + 2);
            double sseMove = calculatePossibilities(cells, k - 1, row + 2, column + 1);
            double sswMove = calculatePossibilities(cells, k - 1, row + 2, column - 1);
            double swwMove = calculatePossibilities(cells, k - 1, row + 1, column - 2);
            double nwwMove = calculatePossibilities(cells, k - 1, row - 1, column - 2);
            double nnwMove = calculatePossibilities(cells, k - 1, row - 2, column - 1);
            cells[row][column][k] = (nneMove + neeMove + seeMove + sseMove + sswMove + swwMove + nwwMove + nnwMove) / 8;
        }


        return cells[row][column][k];
    }
}