class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0, zeros = 0;
        
        // Count the number of '1's and '0's
        for (char ch : s.toCharArray()) {
            if (ch == '1') ones++;
            else zeros++;
        }

        // Construct the maximum odd binary number
        StringBuilder result = new StringBuilder();
        
        // Place (ones - 1) '1's at the beginning
        for (int i = 0; i < ones - 1; i++) {
            result.append('1');
        }

        // Place all '0's in the middle
        for (int i = 0; i < zeros; i++) {
            result.append('0');
        }

        // Ensure the last character is '1' (to make it odd)
        result.append('1');

        return result.toString();
    }
}
