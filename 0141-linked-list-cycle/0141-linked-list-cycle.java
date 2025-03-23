/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Boolean> map = new HashMap<>();
        ListNode temp = head;

        while (temp != null) {
            if (map.containsKey(temp)) {
                return true; // Cycle detected
            }
            map.put(temp, true);
            temp = temp.next;
        }
        return false;
    }
}