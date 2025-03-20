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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
    ListNode temp = head; // Renaming current to temp

    while (temp != null) {
        ListNode nextNode = temp.next; // Save next node
        temp.next = prev; // Reverse link
        prev = temp; // Move prev forward
        temp = nextNode; // Move temp forward
    }

    return prev; 
    }
}