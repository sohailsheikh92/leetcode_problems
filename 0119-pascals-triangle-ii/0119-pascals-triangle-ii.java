class Solution {
    // Function to compute nCr
    public static int nCr(int n, int r) {
        long result = 1;
        for (long i= 1; i <= r; i++) {
            result = result * (n - i + 1);
            result = result / i;
        }
        return (int)result;
    }

    // Function to get the entire row using nCr with i starting from 0
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) { // i starts at 0
            row.add(nCr(rowIndex, i));
        }
        return row;
    }


}