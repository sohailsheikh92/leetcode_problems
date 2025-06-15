class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;

        // Step 1: Find length of the list
        int len = 0;
        ListNode end = head;
        while (end != null) {
            len++;
            end = end.next;
        }

        k = k % len;
        if (k == 0) return head;

        int traverse = len - k;

        // Step 2: Move to the (len - k)-th node
        ListNode temp = head;
        for (int i = 1; i < traverse; i++) {
            temp = temp.next;
        }

        // Step 3: Rotate
        ListNode newHead = temp.next;
        temp.next = null;

        ListNode curr = newHead;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;

        return newHead;
    }
}

