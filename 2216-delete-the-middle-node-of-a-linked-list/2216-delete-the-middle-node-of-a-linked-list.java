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
    public ListNode deleteMiddle(ListNode head) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==0)
            return null;
        if(len==1)
            return head.next;
        int middle=len/2;
        int i=0;
        temp=head;
        while(i<middle-1){
            temp=temp.next;i++;}
        temp.next=temp.next.next;
        return head;
    }
}