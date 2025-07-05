class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501]; // assuming arr[i] ≤ 500
        for (int num : arr) {
            freq[num]++;
        }
        for (int i = 500; i >= 1; i--) { // start from larger numbers
            if (freq[i] == i) return i;
        }
        return -1;
    }
}
