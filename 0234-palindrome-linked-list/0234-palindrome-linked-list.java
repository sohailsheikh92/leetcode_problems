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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secHalf=reverse(slow);
        
        ListNode firstHalf=head;
        while(secHalf!=null){
            if(firstHalf.val!=secHalf.val)
                return false;
            firstHalf=firstHalf.next;
            secHalf=secHalf.next;
        }
        return true;
    }

    static ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode front = head.next;
            head.next=prev;
            prev=head;
            head=front;
        }
        return prev;
    }
}