class Solution {
    public double myPow(double x, int n) {
        long nn = n; // convert n to long to handle Integer.MIN_VALUE safely

        if (nn < 0) {
            x = 1 / x;
            nn = -nn;
        }

        return power(x, nn);
    }

    private double power(double x, long n) {
        if (n == 0) return 1.0; // base case

        if (n % 2 == 1) { // odd power
            return x * power(x, n - 1);
        } else {          // even power
            double half = power(x, n / 2);
            return half * half;
        }
    }
}
