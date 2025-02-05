class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        // Traverse the array from rightmost digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Simple increment if no carry needed
                return digits;
            }
            digits[i] = 0; // If digit is 9, set it to 0 and continue carrying
        }

        // If all digits were 9, we need an extra digit at the start
        int[] result = new int[n + 1];
        result[0] = 1; // Example: 999 -> 1000
        return result;

    }
}