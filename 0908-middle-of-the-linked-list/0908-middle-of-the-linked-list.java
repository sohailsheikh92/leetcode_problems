/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
         ListNode slow = head; // Moves one step
        ListNode fast = head; // Moves two steps

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow by 1 step
            fast = fast.next.next;  // Move fast by 2 steps
        }

        return slow; // Slow is now at the middle
    }
}