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
    static int length(ListNode head){
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        ListNode prev=null;
        int len=length(head);
        int middle=len/2;
        ListNode temp=head;
        for(int i=0;i<middle;i++){
            prev=temp;
            temp=temp.next;
        }
        if (prev != null) { // Ensure prev is not null before accessing next
        prev.next = temp.next;
    }
        return head;
    }
}