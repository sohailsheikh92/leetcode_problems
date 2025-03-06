class Solution {
    static void reverse(char[] arr, int i, int j) {  // Pass char[] instead of String
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public String reverseWords(String s) {
        char[] arr = s.toCharArray();  // Convert to mutable array
        int n = arr.length;
        int sp = 0;

        for (int ep = 0; ep < n; ep++) {
            if (arr[ep] == ' ') {
                reverse(arr, sp, ep - 1);  // Reverse the word
                sp = ep + 1;  // Move to the next word
            }
            if (ep == n - 1) {
                reverse(arr, sp, ep);  // Reverse the last word
            }
        }

        return new String(arr);  // Convert back to string
    }
}
