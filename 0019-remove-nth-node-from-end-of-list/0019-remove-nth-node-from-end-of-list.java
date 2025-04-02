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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==n){
            ListNode newhead=head.next;
            return newhead;
        }
        int res=len-n;
        temp=head;
        while(temp!=null && res>1){
            temp=temp.next;
            res--;
        }
        temp.next=temp.next.next;
        return head;
    }
}