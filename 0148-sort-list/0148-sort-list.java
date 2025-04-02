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
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(al);
        ListNode head1=new ListNode(al.get(0));
        ListNode curr=head1;
        for(int i=1;i<al.size();i++){
            curr.next=new ListNode(al.get(i));
            curr=curr.next;
        }
        return head1;
    }
}