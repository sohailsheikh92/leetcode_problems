class Solution {
  

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long value = 1;  // Use long to avoid overflow

        row.add(1); // First element is always 1

        for (int i = 1; i <= rowIndex; i++) {
            value = value * (rowIndex - i + 1);
            value = value / i;
            row.add((int) value);  // Convert to int if you're sure of size
        }

        return row;
    }


}