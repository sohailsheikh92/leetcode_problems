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
    public ListNode removeNodes(ListNode head) {
        List<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        ArrayList<Integer> al1=new ArrayList<Integer>();
        int max=al.get(al.size()-1);
        al1.add(max);
        for(int i=al.size()-2;i>=0;i--){
            if(al.get(i)>=max){
                al1.add(al.get(i));
                max=al.get(i);
            }
        }
        Collections.reverse(al1);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int i : al1){
            curr.next=new ListNode(i);
            curr=curr.next;
        } 

        return dummy.next;
    }
}