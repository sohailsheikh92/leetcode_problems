/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set1=new HashSet<>();
        Set<ListNode> set2=new HashSet<>();
        ListNode temp1=headA,temp2=headB;
        while(temp1!=null){
            set1.add(temp1);
            temp1=temp1.next;
        }
        while(temp2!=null){
            set2.add(temp2);
            temp2=temp2.next;
        }
        temp1=headA;
         while (temp1 != null) {
            if (set2.contains(temp1)) {
                return temp1; // First intersection point found
            }
            temp1 = temp1.next;
        }

        return null;
    }
}