class Solution {
    public int reverse(int x) {
        // Get the sign of the given integer
        int sign = 1;
        if (x < 0) {
            sign = -1;
        }
        
        // Make x positive
        int pos = Math.abs(x);
        int rev = 0;
        
        while (pos > 0) {
            int last_digit = pos % 10;  // Get the last digit
            // Check for overflow before multiplying rev by 10 and adding the last digit
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && last_digit > Integer.MAX_VALUE % 10)) {
                return 0;  // Return 0 if overflow occurs
            }
            rev=rev*10+last_digit;
            pos /= 10;  // Remove the last digit
        }
        
        // Apply the sign
        rev = rev * sign;
        
        // // Handle overflow and underflow
        // if (rev <= Integer.MAX_VALUE && rev >= Integer.MIN_VALUE) {
        //     return rev;
        // }
        
        return rev;  // Return 0 if the reversed number overflows or underflows
    }
}
