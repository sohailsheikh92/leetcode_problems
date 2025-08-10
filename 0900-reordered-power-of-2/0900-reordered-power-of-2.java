class Solution {
    public boolean reorderedPowerOf2(int n) {
        Set<String> powerSet = new HashSet<>();
        for (int i = 0; i < 31; i++) { // 2^0 to 2^30 (within int range)
            String s = String.valueOf(1 << i);
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            powerSet.add(new String(arr));
        }

        // Sort digits of n
        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);
        String sortedN = new String(digits);

        // Check if it matches any power of two's digit pattern
        return powerSet.contains(sortedN);
    }
}